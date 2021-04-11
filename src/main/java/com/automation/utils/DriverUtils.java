package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.ConfigUtils.loadProperties;


public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("application.url"));
    }



    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
