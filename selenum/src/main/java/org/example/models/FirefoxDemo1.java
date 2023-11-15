package org.example.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo1 {
    public static void main(String [] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\RECURSOS\\driver_v1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.upsa.edu.bo/es/");
    }
}
