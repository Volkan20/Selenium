package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);
//get window handle for the main page
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();
//store all the handles in a set
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
//have an iterator in order to iterator through the handles
        Iterator<String> it = allWindowHandles.iterator();
//take the first step and assign the main handle
        mainPageHandle = it.next();
//take the second step and have a child handle
        String childHandle = it.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);


    }
}
