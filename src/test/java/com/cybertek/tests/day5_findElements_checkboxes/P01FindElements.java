package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01FindElements {
    public static void main(String[] args) {
        /***
         * TC #0: FINDELEMENTS
         * 1. Open Chrome browser
         * 2. Go to https://www.merriam-webster.com/
         * 3. Print out the texts of all links
         * 4. Print out how many link is missing text
         * 5. Print out how many link has text
         * 6. Print out how many total link
         */

       WebDriver driver =  WebDriverFactory.getDriver("chrome");
       driver.get("https://www.merriam-webster.com");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);






        String locator = "//body//a";

        List<WebElement> listOflinks =  driver.findElements(By.xpath(locator));


        int numberoflinks = listOflinks.size();
        System.out.println("number of links"+numberoflinks);


        int number_of_linkswithtext = 0;


        for(WebElement each : listOflinks) {
            System.out.println(each.getText());
            number_of_linkswithtext++;

        }

        System.out.println();
        System.out.println("number of linkes that has text"+number_of_linkswithtext);


if(numberoflinks == number_of_linkswithtext){
    System.out.println("no missing links");
}else if(number_of_linkswithtext < numberoflinks){
    System.out.println("we have this many links without text "+number_of_linkswithtext);
}





//for(int i = 1; i <= listOfText.size()-1; i++){
//    System.out.println(listOfText.get(i).getText());
//count++;
//
//        }

      //  System.out.println("erjehg"+count);

driver.close();





}
}
