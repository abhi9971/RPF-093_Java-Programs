package com.briddgelabz.Junit;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME = "[A-Z][a-z]{3,}";
    private static final String LASTNAME = "[A-Z][a-z]{3,}";
    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    UserRegistrationInterface firstNameValidate = fName -> {
        boolean result = Pattern.matches(NAME, fName);
        if (result) {
            return result;
        } else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME, "Invalid Firsrt Name");
        }
    };

    UserRegistrationInterface lastNameValidate = lName -> {
        boolean result = Pattern.matches(LASTNAME, lName);
        if (result) {
            return result;
        } else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME, "Invalid Last Name");
        }
    };

    UserRegistrationInterface emailValidate = email -> {
        boolean result = Pattern.matches(EMAIL, email);
        if (result) {
            return result;
        } else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
        }
    };

    UserRegistrationInterface phoneNumberValidate = phoneNumber -> {
        boolean result = Pattern.matches(PHONE_NUMBER, phoneNumber);
        if (result) {
            return result;
        } else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER, "Invalid Phone Number");
        }
    };

    UserRegistrationInterface passwordValidate = password -> {
        boolean result = Pattern.matches(PASSWORD, password);
        if (result) {
            return result;
        } else {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD, "Invalid Password");
        }
    };
}