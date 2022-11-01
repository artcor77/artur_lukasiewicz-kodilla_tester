package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"artcar:true", "..aRtcAr :true", "A,r,t,Ca,R:false", "artcar :true", "A:false", ":false"}, delimiter = ':')
    public void testValidateUsername(String input, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"artcar:false", "..aRtcAr :false", "A,r,t,Ca,R:false", "artcar :false", "A:false",
    "artcar@:false", "artcar@gmail:false", "artcar@gmail.:false", "artcar@gmail.com:true",
            "artcargmail.com:false", "artcar@gmailcom:false", "artcar@gm_ail.com:false", "art_c.ar@gmailcom:false",
            ":false"}, delimiter = ':')
    public void testValidateEmail(String input, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(input));
    }
}