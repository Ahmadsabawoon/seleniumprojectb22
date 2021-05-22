package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrdersLogIn {
    public static void main(String[] args) {

        //TC#5: Basic login authentication
        // 1-Open a chrome browser
       // WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        // 3-Verify title equals:Expected: Web Orders Login
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Login page title verification passed!");
        } else {
            System.out.println("Login page title verification failed!!");
        }

        // 4-Enter username: Tester
        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUserName.sendKeys("Tester");
        // 5-Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");
        // 6-Click “Sign In” button
       WebElement logInButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
       logInButton.click();
        // 7-Verify title equals:
        // Expected: Web Orders
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualHomePageTitle.equals(expectedHomePageTitle)) {
            System.out.println("Home page title verification Passed!");
        } else {
            System.out.println("Home page title verification Failed!!!");
        }



    }
}
