package com.mptp.tests;

import com.github.javafaker.Faker;
import com.mptp.utilities.BrowserFactory;
import com.mptp.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondTest {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Test Case 2 - Basic login and locator task
         * 1. Open browser
         * 2. Go to website https://www.saucedemo.com/
         * 3. Verify title equals : String expectedTitle = "Swag Labs"
         * Day06-Task 3
         * 4. Enter username: provided from page
         * 5. Enter password: provided from page
         * 6. Click “Login” button
         * 7. Verify title equals: String expectedProductPageTitle = "Swag Labs"
         * 8. add 6 products to cart from the top
         * 9. Verify that the products are on the cart
         * 10. remove all the products from the cart
         * Hint : You should use different locator each time
         */

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");
        String expectedTitle = "Swag Labs";
        String actualTitle=driver.getTitle();
        StringUtility.verifyEquals(expectedTitle, actualTitle);
        Thread.sleep(2000);
        WebElement userName=driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.cssSelector("#password"));
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
        Thread.sleep(2000);
        String expectedProductPageTitle = "Swag Labs";
        String actualProductPageTitle=driver.getTitle();
        StringUtility.verifyEquals(expectedProductPageTitle,actualProductPageTitle);
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Thread.sleep(1000);
        String expectedText="6";
        String actualText=driver.findElement(By.className("shopping_cart_badge")).getText();
        StringUtility.verifyEquals(expectedText, actualText);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-bike-light']")).click();
        driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector("#remove-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.cssSelector("#remove-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//button[@name='remove-test.allthethings()-t-shirt-(red)']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
