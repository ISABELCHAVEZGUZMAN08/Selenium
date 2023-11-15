package org.example.Localizadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingLinkText {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\RECURSOS\\driver_v1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.upsa.edu.bo/es/");
        driver.findElement(By.linkText("DOCENTES")).click();

    }
}
