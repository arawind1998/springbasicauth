package com.sri.springbasicauth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * How to validate email address with regular expression
 *
 */
public class Validator
{

    //Email
    private Pattern pattern_email;
    private Matcher matcher_email;

    //SSN
    private static Pattern pattern_ssn;
    private static Matcher matcher_ssn;

    //username

    private Pattern pattern_username;
    private Matcher matcher_username;


    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final String SSN_REGEX = "^(\\d{3}-\\d{2}-\\d{4})";

    private static final String USERNAME_REGEX = "^[a-z0-9_-]{3,15}$";


    public Validator()
    {
        pattern_email = Pattern.compile(EMAIL_REGEX);
        pattern_ssn = Pattern.compile(SSN_REGEX);
        pattern_username = Pattern.compile(USERNAME_REGEX);
    }

    /**
     * Validate hex with regular expression
     *
     * @param email email for validation
     * @return true valid email, false invalid email
     */
    public boolean validate_email(final String email)
    {
        matcher_email = pattern_email.matcher(email);
        return matcher_email.matches();
    }

    public boolean validate_username(final String username)
    {
        matcher_username = pattern_username.matcher(username);
        return matcher_username.matches();
    }

    public static boolean validate_ssn(final String ssn)
    {
        matcher_ssn = pattern_ssn.matcher(ssn);
        return matcher_ssn.matches();
    }

}

