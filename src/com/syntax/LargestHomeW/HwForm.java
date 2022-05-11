package com.syntax.LargestHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to http://www.uitestpractice.com/
//go to Form
//and fill out everything
public class HwForm {
    public static String url = "http://www.uitestpractice.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.linkText("Form")).click();

        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys("Volkan");
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys("Dereli");


    }
}
