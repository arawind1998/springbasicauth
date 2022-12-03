package com.sri.springbasicauth.controller;

import com.sri.springbasicauth.model.Application;

import java.util.List;

public class Topic {
    private List<Application> applicationList;

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }
}

