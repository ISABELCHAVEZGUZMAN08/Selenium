package org.example.Localizadores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingById {

    //solo por id
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\RECURSOS\\driver_v1\\geckodriver.exe");
      //Instanciar un webDriver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.upsa.edu.bo/es/");
        driver.findElement(By.id("password")).click();
    }
}
