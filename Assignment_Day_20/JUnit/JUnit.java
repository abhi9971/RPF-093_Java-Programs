package com.bridgelab.Junit;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {
    Scanner sc;

    public boolean firstName(String firstName) {

        sc = new Scanner(System.in);

        System.out.println("Enter value");

        int number = sc.nextInt();

        boolean answer = Pattern.matches("[A-Z][a-z]{2,}", firstName);

        if (answer) {

            System.out.println("thank you");

            return true;

        }
        else {

            System.out.println("please enter valid first name ");

            return false;
        }

    }

    public boolean lastName(String lastName) {

        boolean answer = Pattern.matches("[A-Z][a-z]{2,}", lastName);

        if (answer) {

            System.out.println("thank you");

            return true;

        }
        else {

            System.out.println("please enter valid last name ");

            return false;
        }

    }

    public boolean email(String email) {

        boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@bl[.]co([.]in)*", email);

        if (answer) {

            System.out.println("thank you");

            return true;

        }
        else {

            System.out.println("please enter valid email ID ");

            return false;
        }

    }

    public boolean contactNumber(String contactNumber) {

        boolean answer = Pattern.matches("91\\s[0-9]{10}", contactNumber);

        if (answer) {

            System.out.println("Thank you");

            return true;

        }
        else {

            System.out.println("enter valid contact number");

            return true;
        }

    }

    public void password1(String  password) {

        boolean answer = Pattern.matches("[a-zA-Z0-9]{8,}", password);

        if (answer) {

            System.out.println("Thank you");

        }
        else {

            System.out.println("enter valid password");
        }

    }

    public void password2(String  password) {

        // rule1 = minimum 8 characters & atleast 1 upper case
        boolean answer = Pattern.matches("[A-Z]+[a-z]{7,}", password);

        if (answer) {

            System.out.println("Thank you");

        }
        else {

            System.out.println("enter valid password");
        }

    }

    public void password3(String  password) {

        // rule1 = minimum 8 characters & atleast 1 upper case
        boolean answer = Pattern.matches("[A-Z]+[a-z]+", password);

        if (answer) {

            System.out.println("Thank you");

        }
        else {

            System.out.println("enter valid password");
        }

    }

    public void password4(String  password) {

        // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("[A-Z]+[a-z]+[0-9]+", password);

        if (answer) {

            System.out.println("Thank you");

        }
        else {

            System.out.println("enter valid password");
        }
    }

    public void password5(String password) {

        // rule1 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("[A-Z]+[a-z]+\\W[0-9]+", password);

        if (answer) {

            System.out.println("Thank you");

        }
        else {

            System.out.println("enter valid password");
        }
    }

    public boolean emailValidation(String email) {

        // this is code for question 2 which satisfies for all emails given to check.
        boolean answer = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", email);

        if (answer) {

            System.out.println("Thank you");

            return true ;

        }
        else {

            System.out.println("enter valid password");

            return false;
        }

    }

}

public class JUnit {

    public static void main(String[] args) {
        
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("see all validation is Test cases");

        //********************* THANK-YOU************
    }

}
