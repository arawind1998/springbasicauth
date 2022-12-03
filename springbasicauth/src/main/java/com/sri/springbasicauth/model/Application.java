package com.sri.springbasicauth.model;


public class Application {
    String firstName;
    String lastName;
    String email;
    String SSN;
    boolean firstName_b;
    boolean lastName_b;
    boolean email_b;
    boolean SSN_b;

    public boolean isFirstName_b() {
        return firstName_b;
    }

    public void setFirstName_b(boolean firstName_b) {
        this.firstName_b = firstName_b;
    }

    public boolean isLastName_b() {
        return lastName_b;
    }

    public void setLastName_b(boolean lastName_b) {
        this.lastName_b = lastName_b;
    }

    public boolean isEmail_b() {
        return email_b;
    }

    public void setEmail_b(boolean email_b) {
        this.email_b = email_b;
    }

    public boolean isSSN_b() {
        return SSN_b;
    }

    public void setSSN_b(boolean SSN_b) {
        this.SSN_b = SSN_b;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
