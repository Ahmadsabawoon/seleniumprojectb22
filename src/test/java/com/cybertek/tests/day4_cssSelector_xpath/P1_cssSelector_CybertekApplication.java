package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_CybertekApplication {
    public static void main(String[] args) {
        /**
         * TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
         * 1. Open Chrome browser
         * 2. Go to http://practice.cybertekschool.com/forgot_password
         * 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
         * a. “Home” link
         * b. “Forgot password” header
         * c. “E-mail” text
         * d. E-mail input box
         * e. “Retrieve password” button
         * f. “Powered by Cybertek School” text
         * 4. Verify all WebElements are displayed.
         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

       WebElement homeLink =  driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("Home Link is confirmed: " + homeLink.isDisplayed());
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());  // homelink.isdisplayed.soutv

        WebElement forgotPasswordHeadr = driver.findElement(By.tagName("h2"));
        System.out.println("forgot password header is confirmed: " + forgotPasswordHeadr.isDisplayed());

        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("Email text is confirmed: " + emailText.isDisplayed());

        WebElement emailInput = driver.findElement(By.cssSelector("input[type='text']"));
        System.out.println("Email input is confirmed: " + emailInput.isDisplayed());

        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("Retrieve password is confirmed: " + retrievePassword.isDisplayed());

        WebElement poweredByCerbertekSchool = driver.findElement(By.cssSelector("a[target='_blank']"));
        System.out.println("Power by Cybertek School button is confirmed: " + poweredByCerbertekSchool.isDisplayed());


    }
}
