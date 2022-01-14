package com.briddgelabz.Junit;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("Anna");

            Assertions.assertTrue(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("A");

            Assertions.assertFalse(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("Bond");

            Assertions.assertTrue(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("krs");

            Assertions.assertFalse(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        try {
            boolean result = userRegistrationRegEx.emailValidate.userEntries("xyz.abc@bl.co.in");
            Assertions.assertTrue(result);
        } catch (InvalidUserInputException e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.emailValidate.userEntries("xyz.abc@bl.in");

            Assertions.assertFalse(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);

        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("91 8888888888");

            Assertions.assertTrue(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("9888888888");

            Assertions.assertFalse(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Xyz12345#");

            Assertions.assertTrue(result);

        }
        catch (InvalidUserInputException e) {

            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {

        UserRegistration userRegistrationRegEx = new UserRegistration();

        try {

            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Jdjfd32#%");

            Assertions.assertFalse(result);

        }
        catch (InvalidUserInputException e) {
            
            System.out.println(e);
        }
    }
}
