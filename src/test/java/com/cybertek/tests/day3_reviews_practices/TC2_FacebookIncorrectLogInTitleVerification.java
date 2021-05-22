package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 TC #2: Facebook incorrect login title verification
 1.Open Chrome browser
 2.Go to https://www.facebook.com
 3.Enter incorrect username
 4.Enter incorrect password
 5.Verify title changed to:
 Expected: “Log into Facebook | Facebook”
 */
public class TC2_FacebookIncorrectLogInTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();
Thread.sleep(2000);
     WebElement userName = driver.findElement(By.id("email"));
             userName.sendKeys("yourusername");
     WebElement password = driver.findElement(By.id("pass"));
            password .sendKeys("yourpassword");
    driver.findElement(By.name("login")).click();

    String actualTitle = driver.getTitle();
    String expectedTitle = "Log into Facebook";

    if (actualTitle.equals(expectedTitle)) {
        System.out.println("Facebook Incorrect log in Title Verification is PASSED!");
    } else {
        System.out.println("Facebook Incorrect log in Title Verification is FAILED!!!");
    }









    }
}
