package org.example.objectsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomePage {
    public WebDriver driver;
    By productOne= By.linkText("Camiseta Estampado Colibrí");
    By productTwo= By.linkText("Jersey Estampado Colibrí");
    By producto3= By.linkText("Lo Mejor Está Por Venir'...");
    By producto4= By.linkText("Comienza La Aventura Enmarcado...");


    public ShopHomePage(WebDriver driver) {
        this.driver = driver;
    }
    // crear los metodos para todos los By
    public WebElement getproductUno() {
        return driver.findElement(productOne);
    }
    public WebElement getproductTwo() {
        return driver.findElement(productTwo);
    }
}
