package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class basepage1 {

    public static WebDriver driver;
    private String url;
    private Properties properties;

    public basepage1() throws IOException {
        properties = new Properties();
        FileInputStream dato = new FileInputStream(
                System.getProperty("user.id") + "\\src\\main\\java\\resources\\config.properties");
        properties.load(dato);
    }

    public WebDriver getDriver() throws IOException {
        //conseguira el driver si es de chrome de firefox o edge
        if (properties.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.id") + "\\src\\main\\java\\drivers\\ChromeDemo");
            driver = new ChromeDriver();
        } else if (properties.getProperty("browser").equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.id") + "\\src\\main\\java\\drivers\\FirefoxDemo");
            driver = new FirefoxDriver();

        } else {
            System.setProperty("webdriver.edge.driver",
                    System.getProperty("user.id") + "\\src\\main\\java\\drivers\\EdgeDemo");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public String url (){
        url =properties.getProperty("url");
        return url;
    }

}
