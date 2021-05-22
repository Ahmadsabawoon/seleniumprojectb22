package com.cybertek.tests.Practice_05_21_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 *Amazon.com Search "Wooden Spoon"
 *
 * 1. Build the WebDriverManager and call Chrome Driver
 *
 * 2. Go to Amazon.com
 *
 * 3. Locate the amazon search bar
 *
 * 4. Send "Wooden Spoon" and click search
 *
 * 5. Check the title with if conditon
 */
public class Task2AC {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
        searchBar.sendKeys("Wooden Spoon");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Actual title verification Passed");
        } else {
            System.out.println("Actual title verification Failed");
        }







    }
}
