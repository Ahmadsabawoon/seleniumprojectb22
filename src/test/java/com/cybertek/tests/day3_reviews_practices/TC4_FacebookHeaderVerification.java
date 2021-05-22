package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_FacebookHeaderVerification {
    public static void main(String[] args) {
/**
 * TC #4: Facebook header verification
 * 1.Open Chrome browser
 * 2.Go to https://www.facebook.com
 * 3.Verify “Create a page” link href value contains text:
 * Expected: “registration_form”
 */


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement facebookLink = driver.findElement(By.linkText("Create a Page"));
        String actualHref = facebookLink.getAttribute("href");
        String expectedInHref = "registration_form";


        if (actualHref.contains(expectedInHref)) {
            System.out.println("Facebook Header verification is PASSED!");
        } else {
            System.out.println("Facebook Header Verification is FAILED!!!");
        }













    }
}
