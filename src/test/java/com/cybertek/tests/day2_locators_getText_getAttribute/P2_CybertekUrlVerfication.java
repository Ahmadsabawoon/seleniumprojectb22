package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
  Explaining high level what is going on in this page
 */

public class P2_CybertekUrlVerfication {
    public static void main(String[] args) {
//TC #2: Cybertek practice tool verifications

// setup the browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // maximize the browser
        driver.manage().window().maximize();

        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");

        //3. VerifyURLcontains
        //Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)) {
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAILED!");
        }


        //4. Verify title:
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }

    }
}
