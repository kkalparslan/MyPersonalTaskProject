package com.mptp.tests;

import com.mptp.utilities.BrowserFactory;
import com.mptp.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class FirstTests {

    /**
     * Tests
     *
     * 2. Automate the provided Test Case 1 using 3 different browsers.
     * 3. Create a separate test method for each browser.
     * a. If you are using Windows, create test methods for Chrome, Firefox,
     * Edge.
     * 4. Each test should close the browser after completion.
     * 5. Test methods must use the utilities.
     * 6. Run all three test methods from the main method.
     * -------------------------------------------------------
     * Test Case 1 - Basic navigation task
     * 1. Open browser
     * 2. Go to website https://google.com
     * 3. Save the title in a string variable
     * 4. Go to https://etsy.com
     * 5. Save the title in a string variable
     * 6. Navigate back to previous page
     * 7. Verify that title is same is in step 3
     * 8. Navigate forward to previous page
     * 9. Verify that title is same is in step 5
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title1=driver.getTitle();
        Thread.sleep(2000);
        driver.get("https://etsy.com");
        String title2=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        String title3=driver.getTitle();
        Thread.sleep(2000);
        StringUtility.verifyEquals(title1, title3);
        driver.navigate().forward();
        String title4= driver.getTitle();
        StringUtility.verifyEquals(title2, title4);
        Thread.sleep(2000);
        driver.quit();

    }
}
