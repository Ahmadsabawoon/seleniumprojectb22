package com.cybertek.tests.Practice_05_21_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Yahoo Email Login
 *
 *
 * 1. SetUp The chrome Driver Calling WebDriver Manager / Bonigarcia Dependencies (Not the Method)
 *
 * 2. Access the Yahoo Email Login page with this link: "https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd"
 *
 * 3. Make the browser screen => fullscreen
 *
 * 4. Check the title of the Yahoo page with an IF statement
 *
 * 5. Locate the username space By ID
 *
 * 6. Send the username credentials to the located username space. Use "batch22@yahoo.com" - as username
 * Put the whole thread to Sleep for 3 seconds
 *
 * 7. Click NEXT to go to the next (Password insert space)
 *
 * 8. Locate the password space By ID
 * Put the whole thread to Sleep for 3 seconds
 *
 * 9. Send the password credentials to the located password space. Use "Feb21@2021" - as password
 *
 * 10 Click LOGIN button
 * Put the whole thread to Sleep for 3 seconds
 *
 * 11. Checking the new title Put a new IF condition Stating "Login Successful" as true - "Failed to Login" as false of your last IF condition. Note that still comparin actual and expected title
 */
public class Task3AC {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        WebElement userId = driver.findElement(By.id("login-username"));

        userId.sendKeys("Feb21@2021" );
        userId.click();

//        WebElement passwordId = driver.findElement(By.id(""));

    }
}
