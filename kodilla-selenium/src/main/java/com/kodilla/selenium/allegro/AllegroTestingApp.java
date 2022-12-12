package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookiesAlert = driver.findElement(By.cssSelector("button[data-role*=accept-consent]"));
        cookiesAlert.click();

        WebElement searchField = driver.findElement(By.cssSelector("input.msts_pt"));
        searchField.sendKeys("mavic mini");

        WebElement categoriesCombo = driver.findElement(By.cssSelector("select.mr3m_1"));
        Select electronicsSelect = new Select(categoriesCombo);
        electronicsSelect.selectByIndex(3);
        categoriesCombo.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe("https://allegro.pl/kategoria/elektronika?string=mavic%20mini"));

        List<WebElement> articleList = driver.findElements(By.cssSelector("section > article"));
        for (WebElement article : articleList) {
            System.out.println("====================");
            System.out.println(article.getText());
        }
    }
}
