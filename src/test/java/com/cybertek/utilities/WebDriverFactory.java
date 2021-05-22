package com.cybertek.utilities;
// Task: New method creation
// Method name : get driver
// static method
// accept string args : browser type
// - this arg will determine what type of browser is opened
// if chrome is passes -> it will open chrome browser
// if firefox passed -> it will open firefox browser
// return type : "webdriver"


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  WebDriverFactory {
    public static void main(String[] args) {
        System.out.println(getDriver("chrome"));
    }
    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
             return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
          return new FirefoxDriver();

        } else {
            System.out.println("Given browser type is currently supported. Driver = null");
            return null;
        }




    }

}
