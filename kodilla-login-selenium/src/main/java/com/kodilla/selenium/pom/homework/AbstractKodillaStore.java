package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;

public class AbstractKodillaStore {

    protected WebDriver driver;

    public AbstractKodillaStore(WebDriver driver) {
        this.driver = driver;
    }
}
