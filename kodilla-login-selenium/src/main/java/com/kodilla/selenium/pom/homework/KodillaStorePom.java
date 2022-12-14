package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractKodillaStore {

    @FindBy(id = "searchField")
    WebElement searchField;

    @FindBy(className = "element")
    List<WebElement> notebooks;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String word) {
        searchField.sendKeys(word);
    }
}
