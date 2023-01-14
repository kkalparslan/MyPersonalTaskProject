package com.mptp.tests;

import com.mptp.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Deneme {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://www.google.com");

    }
}
