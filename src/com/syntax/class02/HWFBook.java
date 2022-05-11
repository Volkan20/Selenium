package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWFBook {
    ////navigate to fb.com
    //    //click on create new account
    //    //fill up all the textboxes
    //    //click on sign up button
    //    //close the pop up
    //    //close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Volkan");
        driver.findElement(By.name("lastname")).sendKeys("Dereli");
        driver.findElement(By.name("reg_email__")).sendKeys("volkandereli@yahoo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("volkandereli@yahoo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("volkan");
        driver.findElement(By.name("birthday_month")).sendKeys("May");
        driver.findElement(By.name("birthday_day")).sendKeys("17");
        driver.findElement(By.name("birthday_year")).sendKeys("1994");

        driver.findElement(By.name("sex")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
