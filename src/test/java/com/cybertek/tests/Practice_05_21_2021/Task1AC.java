package com.cybertek.tests.Practice_05_21_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * - access to the login page
 * - check if you are on the expected login page
 * - correct username and password
 * - access to the dashboard
 * - check the title after login - if correct with the expected
 * - check if the login title is NOT the same as the Dashboard Title. If not - Passed
 *
 * Username: Storemanager201     Password: UserUser123
 */
public class Task1AC {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";


        String check = actualTitle.equals(expectedTitle) ? "passed: Actual title matches expected" : "Failed : actual is not matching expected";
        System.out.println(check);
        System.out.println(driver.getTitle());
        WebElement usernameLongInPage = driver.findElement(By.xpath("//input[@type='text']"));
        usernameLongInPage.sendKeys("Storemanager201");

        WebElement passwordLogInPage = driver.findElement(By.xpath("//input[@type='password']"));
        passwordLogInPage.sendKeys("UserUser123");
        passwordLogInPage.submit();

        String ActualTitle02 = driver.getTitle();
        //System.out.println(driver.getTitle());
        String expectedTitle02 = "Dashboard";

        String check2 = ActualTitle02.equals(expectedTitle02) ? "Passed" : "Failed";
        System.out.println(check2);

        String checkLogInVsDashboard = ActualTitle02.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLogInVsDashboard);

//        String check2 = !currentTitle.equals(expectedTitle) ? "Test Passed: Login page title doesn't match the Dashboard title" : "Test Failed: Login page title matches Dashboard page title";

    }
}
