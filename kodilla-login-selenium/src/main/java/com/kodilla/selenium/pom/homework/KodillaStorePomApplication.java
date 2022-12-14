package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStorePomApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");

        KodillaStorePom kodillaStorePom = new KodillaStorePom(driver);
        kodillaStorePom.search("school");
        System.out.println(kodillaStorePom.notebooks.size());
        driver.close();
    }
}