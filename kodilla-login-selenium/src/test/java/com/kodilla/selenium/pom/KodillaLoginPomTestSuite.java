package com.kodilla.selenium.pom;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KodillaLoginPomTestSuite {

    KodillaLoginPom loginPom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        loginPom = new KodillaLoginPom(driver);
    }

    @Test
    public void testLoginPage_CheckErrorValidation() {
        //given
        String email = "test@toniedziala.pl";
        String password = "password";
        //when
        boolean loggedIn = loginPom.login(email, password);
        //then
        assertFalse(loggedIn);
    }

    @Test
    public void testLoginPage_CheckPositiveValidation() {
        //given
        String email = "test@kodilla.com";
        String password = "kodilla123";
        //when
        boolean loggedIn = loginPom.login(email, password);
        //then
        assertFalse(loggedIn);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}