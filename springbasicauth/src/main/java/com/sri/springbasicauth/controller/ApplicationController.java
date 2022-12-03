package com.sri.springbasicauth.controller;

import com.sri.springbasicauth.Validator;
import com.sri.springbasicauth.model.Application;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
    @GetMapping("/getMsg")
    public String greeting(){
        return "OmSriGanesha!!";
    }

    @PostMapping("/application")
    public Application createApplication(Application application) {

        Validator Validator = new Validator();
        //return Validator.validate_ssn(application.getSSN());
        application.setSSN_b(Validator.validate_ssn(application.getSSN()));
        application.setEmail_b(Validator.validate_email(application.getEmail()));
        application.setFirstName_b(Validator.validate_username(application.getFirstName()));
        return application;

    }





    @PostMapping("/application2")
    public Topic createApplication3(Topic topic) {

        Validator Validator = new Validator();
        //return Validator.validate_ssn(application.getSSN());

        for(Application application2:topic.getApplicationList()) {

            application2.setSSN_b(Validator.validate_ssn(application2.getSSN()));
            application2.setEmail_b(Validator.validate_email(application2.getEmail()));
            application2.setFirstName_b(Validator.validate_username(application2.getFirstName()));
        }
         return topic;

    }




    /*@PostMapping("/topic")
    public List<Topic> createApplication5() {

        return Arrays.asList(
                new Topic("Srikanth", "Srinivasan", 16);
        );

    }*/


}
