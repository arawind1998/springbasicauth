package com.sri.springbasicauth;

import java.util.ArrayList;

/**
 *
 * How to validate email address with regular expression
 *
 */
public class RegexDemo
{

    public static void main(String[] args)
    {
        // ---------------- valid email ---------------------------------------------
        ArrayList<String> validEmailList = new ArrayList<>();
        validEmailList.add("peter@yahoo.com");
        validEmailList.add("peter@yahoo.net");
        validEmailList.add("peter.50@yahoo.com");
        validEmailList.add("peter-100@yahoo.com");
        validEmailList.add("peter@gmail.com");
        validEmailList.add("peter+900@oracle.com");

        Validator Validator = new Validator();

        for (String email : validEmailList)
        {
            System.out.println(email + " is Valid = " + Validator.validate_email(email));
        }

        // ---------------- valid SSN ---------------------------------------------
        ArrayList<String> validSSNList = new ArrayList<>();
        validSSNList.add("222-33-4444");
        validSSNList.add("222-3-4444");

        for (String ssn : validSSNList)
        {
            System.out.println(ssn + " is Valid = " + Validator.validate_ssn(ssn));
        }


        // ---------------- valid username ---------------------------------------------
        ArrayList<String> validUNList = new ArrayList<>();
        validUNList.add("Peter34");
        validUNList.add("Peter-34");
        validUNList.add("Peter@34");

        for (String username : validUNList)
        {
            System.out.println(username + " is Valid = " + Validator.validate_username(username));
        }
        // ------------------------------------------------------------------------


        System.out.println("--------------------------------------");

        // ---------------- invalid email ---------------------------------------------
        ArrayList<String> inValidEmailList = new ArrayList<>();
        inValidEmailList.add("peteryahoo.com"); // @ Symbol missing
        inValidEmailList.add("peter.50@.yahoo.com"); //. after @ symbol is not allowed
        inValidEmailList.add("peter.@yahoo.com");//. before @ symbol is not allowed
        inValidEmailList.add("peter@gmail@com");// two @ symbols are not allowed
        inValidEmailList.add("peter..900@oracle.com");// two dots are not allowed

        for (String email : inValidEmailList)
        {
            System.out.println(email + " is Valid = " + Validator.validate_email(email));
        }
        // --------------- --------------------------------------------------------------------


        // ---------------- invalid SSN ---------------------------------------------
        ArrayList<String> invalidSSNList = new ArrayList<>();
        invalidSSNList.add("222-333-4444");

        for (String ssn : validSSNList)
        {
            System.out.println(ssn + " is invalid = " + Validator.validate_ssn(ssn));
        }
        // -----------------------------------------------------------
    }

}
