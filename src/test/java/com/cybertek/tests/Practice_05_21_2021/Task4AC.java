package com.cybertek.tests.Practice_05_21_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Task4AC {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cargurus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//select[@id='carPickerUsed_makerSelect']")).click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        WebElement make = driver.findElement(By.xpath("//select[@id='carPickerUsed_makerSelect']"));
//        Select bmw = new Select(make);
//        bmw.selectByVisibleText("BMW");
//        make.click();
//
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        WebElement bodyStyle = driver.findElement(By.xpath("//select[@class='form-control cg-carPicker-modelSelect model-select-dropdown ft-model-selector']"));
//        Select m6 = new Select(bodyStyle);
//        m6.selectByVisibleText("M6");
//        bodyStyle.click();
//
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//input[@aria-label='Zip']")).sendKeys("10017");
//        make.submit();
//
//        Thread.sleep(2000);
//
//        WebElement year = driver.findElement(By.xpath("//select[@name='selectedStartYear']"));
//        Select yearFrom = new Select(year);
//        yearFrom.selectByVisibleText("2013");
//        year.click();
//
//        Thread.sleep(2000);
//
//        WebElement year2 = driver.findElement(By.xpath("//select[@name='selectedEndYear']"));
//        Select yearTo = new Select(year2);
//        yearTo.selectByVisibleText("2019");
//        year2.click();
//        year2.submit();
//
//
//        List<WebElement> linksInTheHtml = driver.findElements(By.xpath("//body//a"));
//
//        int counter = 0;
//        for (WebElement each : linksInTheHtml) {
//            if(each.getAttribute("href").contains("Cars")){
//                counter++;
//            }
//        }
//        System.out.println("Number of the cars on the sale links "+counter);
//        System.out.println("Total number of the links "+linksInTheHtml.size());
//
//
//
//
////        driver.quit();

    }
}
