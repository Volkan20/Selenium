package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

    /*handle each and every alert on the page
     */
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //we can creat just one Alert and we can use it again and again..
        //Alert alert = driver.switchTo().alert(); --> creat one
        //      alert = driver.switchTo().alert(); --> use again
        //After alert we need to switch back drive bc it happens = Automatically =
//simple alert
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert(); // switch to focus to alert
        Thread.sleep(2000);
        simpleAlert.accept(); // handling simple alert
//confirm alert
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();
//prompt alert
        WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the Best!!!");
        promptAlert.accept();

    }
}
