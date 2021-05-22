package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorPracticeXpathPart2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println("headerText.isDisplayed() = " + headerText.isDisplayed());
        WebElement contextMenuLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        contextMenuLink.click();
        //System.out.println("contextMenuLink.isDisplayed() = " + contextMenuLink.isDisplayed());


        WebElement registrationFormGender = driver.findElement(By.xpath("//input[@value='male']"));
        System.out.println("registrationFormGender.isDisplayed() = " + registrationFormGender.isDisplayed());
        registrationFormGender.click();
        WebElement registrationFormDepartmentOffice = driver.findElement(By.xpath("//select[@name='department']"));
        System.out.println("registrationFormDepartmentOffice = " + registrationFormDepartmentOffice);
        registrationFormDepartmentOffice.click();


    }
}
