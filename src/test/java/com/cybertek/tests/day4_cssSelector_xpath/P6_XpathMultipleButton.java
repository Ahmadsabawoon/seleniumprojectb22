package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_XpathMultipleButton {
    public static void main(String[] args) {
/**
 * TC #6: XPATH LOCATOR practice
 * 1. Open Chrome browser
 * 2. Go to http://practice.cybertekschool.com/multiple_buttons
 * 3. Click on Button 1
 * 4. Verify text displayed is as expected:
 * Expected: “Clicked on button one!”
 */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // WebElement firstButton = driver.findElement(By.xpath("//button[@class ='btn btn-primary']"));
        //WebElement firstButton = driver.findElement(By.xpath("']"));
        WebElement firstButton = driver.findElement(By.xpath("button1()"));
        firstButton.click();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result'"));

        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();





    }
}
