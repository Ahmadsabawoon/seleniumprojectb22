package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // the browser driver
        WebDriver driver = new ChromeDriver(); // create instance of selenium of web driver , this line open a browser
        driver.get("https://www.tesla.com");  // get the page for Tesla.com

        // This line will basically maximize the browser size
        driver.manage().window().maximize();

        // will work for mac will not work in windows
       // driver.manage().window().fullscreen();

        System.out.println("Current title: " +driver.getTitle());
        
       String currentUrl =  driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        
        // putting 3 seconds of wait/ stops the code for 3 second
        Thread.sleep(3000);
        // Going back using navigation
        driver.navigate().back();


        // Going forward using the navigation
        Thread.sleep(3000);
        driver.navigate().forward();

        // putting 3 seconds of wait/ stops the code for 3 second
        Thread.sleep(3000);
        // refreshing the page using navigation
        driver.navigate().refresh();

        // going to another url using .to() method
        driver.navigate().to("https://www.google.com");
        System.out.println("Current title: " +driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

      //  System.out.println("Current Url " + driver.getCurrentUrl());

        // This method will close the current opened browser, it will only one browser or one tab, will kill the current session.
        driver.close();

        // driver.quit()
        // - will close all of the opened browsers or tabs within the same session.

        // taskkill /f /im chrome.exe // for closing all browsers















    }
}
