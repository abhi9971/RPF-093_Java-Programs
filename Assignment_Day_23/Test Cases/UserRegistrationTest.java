package com.bridgelabz.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistrationTest userReg = new UserRegistrationTest();

    @Test
    void firstnameValidate() {
        String firstName = "Abhishek";
        assertTrue(userReg.firstname(firstName));

    }

    @Test
    void lastName() {
        String lastName= "Rajawat";
        assertTrue(userReg.lastName(lastName));
    }

    @Test
    void email() {
        String email = "aabhishekrajawat101.co.in";
        assertTrue(userReg.email(email));
    }

    @Test
    void mobile() {
        String mobile = "91 99971944613";
        assertTrue(userReg.mobile(mobile));
    }

    @Test
    void password() {
        String password = "Abhsihek@123";
        assertTrue(userReg.password(password));
    }
}