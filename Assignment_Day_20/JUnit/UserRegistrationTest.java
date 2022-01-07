package com.bridgelab.Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration valid = new UserRegistration();
    @Test
    void firstNameTest() {
        String firstName = "Anzar";
        boolean result = valid.firstName(firstName);
        assertTrue(result);
    }

    @Test
    void lastName() {
        String lastName = "Shaikh";
        boolean result = valid.lastName(lastName);
        assertTrue(result);
    }

    @Test
    void email() {

        String email = "abc.xyz@bl.co.in";
        boolean result = valid.email(email);
        assertTrue(result);

    }

    @Test
    void contactNumber() {
        String contactNumber ="91 9503849559";
        boolean result = valid.contactNumber(contactNumber);
        assertTrue(result);
    }

    // This is parameterised Test for all values of emails provided.

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com.com"})
    void emailValidationTest(String email){
        boolean result =  valid.emailValidation(email);
        assertTrue(result);
    }
    @Test
    void emailValidation() {

        // this is non parameterised test for all emails

        String email1 = "abc@yahoo.com";
        String email2 = "abc-100@yahoo.com";
        String email3 = "abc.100@yahoo.com";
        String email4 = "abc111@abc.com";
        String email5 = "abc-100@abc.net";
        String email6 = "abc.100@abc.com.au";
        String email7 = "abc@1.com";
        String email8 = "abc@gmail.com.com";
        String email9 = "abc+100@gmail.com.com";

        boolean result1 = valid.emailValidation(email1);
        boolean result2 = valid.emailValidation(email2);
        boolean result3 = valid.emailValidation(email3);
        boolean result4 = valid.emailValidation(email4);
        boolean result5 = valid.emailValidation(email5);
        boolean result6 = valid.emailValidation(email6);
        boolean result7 = valid.emailValidation(email7);
        boolean result8 = valid.emailValidation(email8);
        boolean result9 = valid.emailValidation(email9);

        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertTrue(result5);
        assertTrue(result6);
        assertTrue(result7);
        assertTrue(result8);
        assertTrue(result9);
    }
}