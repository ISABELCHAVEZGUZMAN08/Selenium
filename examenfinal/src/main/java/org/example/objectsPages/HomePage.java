package org.example.objectsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;
    // como es css
    By toggle = By.cssSelector(".toggle");
    By homeLink = By.linkText("HOMEPAGE");
    By AcordeonLink= By.linkText("Palanca");

    By ActionsLink= By.linkText("Toggle");
    By BrowserLink= By.linkText("PESTAÑAS DEL NAVEGADOR");

    By BotonesLink= By.linkText("BOTONES");

    By CalculatorLink= By.linkText("CALCULATOR (JS)");

    By FormLink= By.linkText("CONTÁCTENOS FORMULARIO DE PRUEBA");

    By SelectorFlechas= By.linkText("CONTÁCTENOS FORMULARIO DE PRUEBA");

    By DataPickerLink= By.linkText("DATE PICKER");

    By DropDownLink= By.linkText("DROPDOWN CHECKBOX RADIO");

    By FileUpload= By.linkText("FILE UPLOAD");

    By HiddeElementLink= By.linkText("HIDDEN ELEMENTS");

    By IframesLink = By.linkText("IFRAMES");

    By LoaderLink = By.linkText("LOADER");

    By LoaderTwoLink = By.linkText("LOADER TWO");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getToggle()
    {
        return driver.findElement(toggle); // tiene que ser igual a la variable de arriba
    }
}
