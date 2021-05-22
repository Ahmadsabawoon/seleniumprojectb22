package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCybertek {
    public static void main(String[] args) {
        /**
         TC #2: Cybertek practice tool verifications
         1. Open Chrome browser
         2. Go to https://practice.cybertekschool.com
         3. Verify URL contains
         Expected: cybertekschool
         4. Verify title:
         Expected: Practice
         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("practice.cybertekschool.com");

        String currentUrl =  driver.getCurrentUrl();

        String expectedUrl = "cybertekschool";

        if(currentUrl.equals(expectedUrl)) {
            System.out.println("Url is Matching. PASSES!");
        }else{
            System.out.println("Url not Matching. FAILED!!!");
        }

        String expectedTitle = " Practice";

       String currentTitle =  driver.getTitle();

       if(currentTitle.equals(expectedTitle)) {
           System.out.println("PASSES!");
       } else {
           System.out.println("FAILED!!!");
       }











    }
}
