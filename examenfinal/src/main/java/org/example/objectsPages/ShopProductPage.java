package org.example.objectsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
    public WebDriver driver;

    By sizeOption= By.cssSelector("[data-product-attribute='1']");
    By  incremento= By.cssSelector(".touchspin-up");
    By  decremento= By.cssSelector(".touchspin-down");
    By  ButtonCarrito = By.cssSelector("[data-button-action]");

    public ShopProductPage(WebDriver driver) {
        this.driver = driver;
    }
    // Metodos Publicos
    public WebElement getsize() {
        return driver.findElement(sizeOption);

    }

    public WebElement getIncrement() {
        return driver.findElement(incremento);

    }
    public WebElement getDrecrement() {
        return driver.findElement(decremento);

    }

    public WebElement getCarrito() {
        return driver.findElement(ButtonCarrito);

    }
}
