package org.example.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo1 {
    public static void main(String [] args) {
        System.setProperty("webdriver.edge.driver", "C:\\RECURSOS\\driver_v1\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.upsa.edu.bo/es/");
    }
}
