package com.syntax.Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanAirlance {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");

        driver.findElement(By.className("ui-datepicker-trigger")).click();
        driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));


    }
}
