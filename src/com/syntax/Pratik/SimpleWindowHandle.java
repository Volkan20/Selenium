package com.syntax.Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandle {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPage = driver.getWindowHandle();


        WebElement helpclick = driver.findElement(By.linkText("Help"));
        helpclick.click();

        Set<String> allWindowHandle = driver.getWindowHandles();
        System.out.println(allWindowHandle.size());

        Iterator<String> it = allWindowHandle.iterator();

        mainPage = it.next();
        String child = it.next();
        System.out.println(child);

        driver.switchTo().window(mainPage);
        driver.close();

    }
}
