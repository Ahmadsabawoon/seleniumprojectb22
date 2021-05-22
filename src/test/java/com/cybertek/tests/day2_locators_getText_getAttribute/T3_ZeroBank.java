package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_ZeroBank {
    public static void main(String[] args) {
        /**
         TC #3: Zero Bank login title verification1.Open Chrome browser
         2.Go to http://zero.webappsecurity.com/login.html
         3.Enter username: username
         4.Enter password: password
         5.Verify title changed to:
         Expected: “Zero –Account Summary”
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));

        userName.sendKeys("username");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
        password.sendKeys("password");

        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input"));
        signIn.click();

        driver.navigate().back();

        String actualResult = driver.findElement(By.className("brand")).getText();

        String expectedResult = "Zero Bank";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Title result match");
        } else {
            System.out.println("Title result mismatch");
        }


    }
}
