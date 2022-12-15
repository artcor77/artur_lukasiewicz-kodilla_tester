package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("C:\\kodilla-course\\kodilla-course\\kodilla-login-selenium\\results"))
                .snapshotPath(Paths.get("C:\\kodilla-course\\kodilla-course\\kodilla-login-selenium\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage worldTimePage = new WorldTimePage(driver);
        worldTimePage.open();
        worldTimePage.compare();
        worldTimePage.close();
    }
}
