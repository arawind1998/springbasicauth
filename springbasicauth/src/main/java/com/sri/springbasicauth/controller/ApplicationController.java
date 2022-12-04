package com.sri.springbasicauth.controller;

import com.sri.springbasicauth.Validator;
import com.sri.springbasicauth.model.Application;
import com.sri.springbasicauth.model.ApplicationResultsInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
    @GetMapping("/getMsg")
    public String greeting(){
        return "OmSriGanesha!!";
    }

    @PostMapping("/application")
    public Application createApplication(@RequestBody Application application) {

        Validator Validator = new Validator();
        application.setSSN_b(Validator.validate_ssn(application.getSSN()));
        application.setEmail_b(Validator.validate_email(application.getEmail()));
        application.setFirstName_b(Validator.validate_username(application.getFirstName()));
        return application;

    }

    @PostMapping("/applicationresults")
    public ApplicationResultsInfo createApplication3(@RequestBody ApplicationResultsInfo applicationResultsInfo) {

        Validator Validator = new Validator();
        for(Application application2: applicationResultsInfo.getApplicationList()) {
            application2.setSSN_b(Validator.validate_ssn(application2.getSSN()));
            application2.setEmail_b(Validator.validate_email(application2.getEmail()));
            application2.setFirstName_b(Validator.validate_username(application2.getFirstName()));
        }
         return applicationResultsInfo;
    }

    @PostMapping("/applications")
    public List<Application> createApplication(@RequestBody List<Application> applicationList) {
        Validator Validator = new Validator();
        for(Application application:applicationList) {
            application.setSSN_b(Validator.validate_ssn(application.getSSN()));
            application.setEmail_b(Validator.validate_email(application.getEmail()));
            application.setFirstName_b(Validator.validate_username(application.getFirstName()));
        }
        return applicationList;

    }
}
