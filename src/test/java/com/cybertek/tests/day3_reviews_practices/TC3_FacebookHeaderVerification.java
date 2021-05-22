package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_FacebookHeaderVerification {
    public static void main(String[] args) {

        /**
         TC #3: Facebook header verification
         1.Open Chrome browser
         2.Go to https://www.facebook.com
         3.Verify header text is as expected:
         Expected: “Connect with friends and the world around you on Facebook.”
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        WebElement actualHeaderVerification = driver.findElement(By.className("_8eso"));
        String expectedHeaderText = "Connect with friends and the world around you on Facebook.";
       String actualHeaderText = actualHeaderVerification.getText();

       if(actualHeaderText.equals(expectedHeaderText)) {
           System.out.println("Header Verification is PASSED!");
       } else {
           System.out.println("Header verification is FAILED!!!");
       }















    }
}
