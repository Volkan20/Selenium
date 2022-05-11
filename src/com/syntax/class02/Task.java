package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        ///**
        // * Task
        // * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        // * Login
        // * Get title and verify
        // * logout
        // * close the browser
        // */

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String title = driver.getTitle();

        if (title.equals("Web Orders")) {
            System.out.println("Title Is Correct");
        } else {
            System.out.println("Title Is Incorrect");
        }
        driver.findElement(By.id("ctl00_logout")).click();
        //driver.findElement(By.linkText(" ")).click(); -> another way
        driver.quit();


    }
}
