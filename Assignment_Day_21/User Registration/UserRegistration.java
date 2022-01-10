package com.bridgelabz.exception.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {

    Scanner sc;

    public boolean firstName(String firstName) {

        boolean answer = Pattern.matches("[A-Z][a-z]{2,}", firstName);

        try {

            if (answer) {

                System.out.println("thank you");

                return true;

            }
            else {

                throw new InvalidEntryException("please enter valid first Name.");
            }
        }

        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean lastName(String lastName) {

        boolean answer = Pattern.matches("[A-Z][a-z]{2,}", lastName);

        try {

            if (answer) {

                System.out.println("thank you");

                return true;

            }
            else {

                throw  new InvalidEntryException("please enter valid last name.");

            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean email(String email) {

        boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", email);

        try {

            if (answer) {

                System.out.println("thank you");

                return true;

            }
            else {

                throw  new InvalidEntryException("please enter valid email.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean contactNumber(String contactNumber) {

        boolean answer = Pattern.matches("91\\s[0-9]{10}", contactNumber);

        try {

            if (answer) {

                System.out.println("thank you");

                return true;

            }
            else {

                throw  new InvalidEntryException("please enter valid contact number.");

            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());

        }

        return false;
    }

    public void password1(String  password) {

        boolean answer = Pattern.matches("[a-zA-Z0-9]{8,}", password);

        try {

            if (answer) {

                System.out.println("thank you");

            }
            else {

                throw  new InvalidEntryException("please enter valid password.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }
    }

    public void password2(String  password) {

        // rule1 = minimum 8 characters & atleast 1 upper case
        boolean answer = Pattern.matches("[A-Z]+[a-z]{7,}", password);

        try {

            if (answer) {

                System.out.println("thank you");

            }
            else {

                throw  new InvalidEntryException("please enter valid password.");

            }
        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());

        }
    }

    public void password3(String  password) {

        // rule1 = minimum 8 characters & atleast 1 upper case
        boolean answer = Pattern.matches("[A-Z]+[a-z]+", password);

        try {

            if (answer) {

                System.out.println("thank you");

            }
            else {

                throw  new InvalidEntryException("please enter valid password.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }
    }

    public void password4(String  password) {

        // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("[A-Z]+[a-z]+[0-9]+", password);

        try {

            if (answer) {

                System.out.println("thank you");

            }
            else {

                throw  new InvalidEntryException("please enter valid password.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }
    }

    public void password5(String password) {

        // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("[A-Z]+[a-z]+\\W[0-9]+", password);

        try {

            if (answer) {

                System.out.println("thank you");

            }
            else {

                throw  new InvalidEntryException("please enter valid password.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());

        }
    }

    public boolean emailValidation(String email) {

        // this is code for question 2 which satisfies for all emails given to check.
        boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);

        try {

            if (answer) {

                System.out.println("thank you");

                return true;

            }
            else {

                throw  new InvalidEntryException("please enter valid contact number.");
            }

        }
        catch (InvalidEntryException e ) {

            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {

        // please refer above methods & Junit Testing.
    }

}
