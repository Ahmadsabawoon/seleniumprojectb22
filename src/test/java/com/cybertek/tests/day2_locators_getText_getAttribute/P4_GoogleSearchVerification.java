package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        // TC #4:	Google	search
        // 1- Open	a	chrome	browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();//        2- Go	to:


        driver.get("https://www.google.com");

        // 3- Write	“apple”	in	search	box
        // 4- Click	Enter button (keys.enter)
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);



        // 5- Verify title:
        // Expected: Title should start with “apple” word

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!!!");
        }




    }
}
