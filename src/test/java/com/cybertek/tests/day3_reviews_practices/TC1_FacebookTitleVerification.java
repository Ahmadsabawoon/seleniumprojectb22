package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
TC #1: Facebook title verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify title:
Expected: “Facebook -Log In or Sign Up”
 */
public class TC1_FacebookTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        String expectedFacebookTitle = "Facebook - Log In or Sign Up";
      String actualFacebookTitle = driver.getTitle();


      if (actualFacebookTitle.equals(expectedFacebookTitle)) {
          System.out.println("Facebook Title Verification PASSED!");
      } else {
          System.out.println("Facebook Title Verification FAILED!!!");
      }


























    }
}
