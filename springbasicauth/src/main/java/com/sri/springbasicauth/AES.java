package com.sri.springbasicauth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sri.springbasicauth.model.Application;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

@RestController
@RequestMapping("/encrypt")
class AES {
    private SecretKey key;
    private final int KEY_SIZE = 128;
    private final int T_LEN = 128;
    private static Cipher encryptionCipher;
    public static String iv;

    public void init() throws Exception {
        KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(KEY_SIZE);
        key = generator.generateKey();
    }

    public String encrypt(String message) throws Exception {
        byte[] messageInBytes = message.getBytes();
        encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        //GCMParameterSpec spec = new GCMParameterSpec(T_LEN, encryptionCipher.getIV());
        encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = encryptionCipher.doFinal(messageInBytes);
        System.out.println(encode(encryptionCipher.getIV()));
        //iv = encode(encryptionCipher.getIV());
        iv = "JSntEobHOTHPN+kj";
        return encode(encryptedBytes);
    }

    public String decrypt(String encryptedMessage) throws Exception {
        byte[] messageInBytes = decode(encryptedMessage);
        Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        iv = "JSntEobHOTHPN+kj";
        GCMParameterSpec spec = new GCMParameterSpec(T_LEN, decode(iv));
        decryptionCipher.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] decryptedBytes = decryptionCipher.doFinal(messageInBytes);
        return new String(decryptedBytes);
    }

    private String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    private byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }


    @PostMapping("/enc/application")
    public String encryptEverything(Application application) throws Exception {
        AES aes = new AES();
        aes.init();
        return aes.encrypt(application.getEmail());
    }
    @PostMapping("/dec/application")
    public Application decryptEverything(Application application) throws Exception {
        AES aes = new AES();
        aes.init();
        System.out.println(application.getEmail());
        //return aes.decrypt(application.getEmail());
        return application;

    }
}