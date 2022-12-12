package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement cookiesAlert = driver.findElement(By.cssSelector("button[data-role*=accept-consent]"));
        cookiesAlert.click();

        WebElement searchField = driver.findElement(By.xpath("//*[@class=\"msts_pt mgmw_wo mr3m_1 mli2_1 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mg9e_0 mj7a_0 mh36_0 mvrt_8 mlkp_6x mefy_5r mldj_0 mm2b_0 ozg4u mh85_0 _535b5_Y5CDc\"]"));
        searchField.sendKeys("mavic mini");

        WebElement categoriesCombo = driver.findElement(By.xpath("//*[@class=\"mr3m_1 m7er_k4 mj6k_n7 sy40i mgn2_14 mp0t_0a mqu1_21 mgmw_wo mli8_k4\"]"));
        Select electronicsSelect = new Select(categoriesCombo);
        electronicsSelect.selectByIndex(3);

        WebElement submitButton = driver.findElement(By.xpath("//*[@class=\"mgn2_14 mp0t_0a m9qz_yp mp7g_oh mse2_40 mqu1_40 mtsp_ib mli8_k4 mp4t_0 m3h2_0 mryx_0 munh_0 m911_5r mefy_5r mnyp_5r mdwl_5r msbw_2 mldj_2 mtag_2 mm2b_2 mqvr_2 msa3_z4 mqen_m6 m0qj_5r mg9e_0 mj7a_0 mjir_sv m2ha_2 m8qd_qh mjt1_n2 btfbp mgmw_9u msts_enp mrmn_qo mrhf_u8 m31c_kb m0ux_fp bp6m4 meqh_en meqh_bv_m mh36_0 mh36_16_m mvrt_0 mvrt_16_m m7er_40 m7er_56_m _535b5_Vhhlw\"]"));
        submitButton.click();
    }
}
