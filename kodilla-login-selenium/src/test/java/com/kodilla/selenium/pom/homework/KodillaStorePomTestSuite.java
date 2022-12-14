package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTestSuite {

    KodillaStorePom kodillaStorePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaStorePom = new KodillaStorePom(driver);
    }

    @Test
    public void shouldSearchNotebook() {
        //given
        String word = "NoteBook";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(2, result);
    }

    @Test
    public void shouldSearchSchool() {
        //given
        String word = "School";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldSearchBrand() {
        //given
        String word = "Brand";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldSearchBusiness() {
        //given
        String word = "Business";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(0, result);
    }

    @Test
    public void shouldSearchGaming() {
        //given
        String word = "Gaming";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldSearchPowerful() {
        //given
        String word = "Powerful";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(0, result);
    }

    @Test
    public void shouldResultIsCorrectWithLowerCase() {
        //given
        String word = "school";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldResultIsCorrectWithUpperCase() {
        //given
        String word = "SCHOOL";
        //when
        kodillaStorePom.search(word);
        int result = kodillaStorePom.notebooks.size();
        //then
        assertEquals(1, result);
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}