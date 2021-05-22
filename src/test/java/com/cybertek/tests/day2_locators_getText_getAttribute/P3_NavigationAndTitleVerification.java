package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        //        TC #3: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Click to Gmail from top right.
        //<---- locating the web element -----------><-click->
       //  driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail"));

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        String expectedInTitle = "Gmail";

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }

        // control + D : multiplies the current line
        // control + shift + up/down to mover line

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("New title verification is passed!");
        } else {
            System.out.println("New Title Verification is failed!!!");
        }


    }
}
