package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        UserRegistration registration = new UserRegistration();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First-Name: ");

        String firstName = scanner.next();

        registration.validateFirstName(firstName);

        System.out.println("Enter Last-Name: ");

        String lastName = scanner.next();

        registration.validateLastName(lastName);

        System.out.println("Enter Email: ");

        String email = scanner.next();

        registration.validateEmail(email);

        System.out.println("Enter Phone-Number");

        String number = scanner.next();

        registration.validatePhoneNumber(number);

        System.out.println("Enter Password: ");

        String password = scanner.next();

        registration.validatePassword(password);

        registration.register();
    }
}