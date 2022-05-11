package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class homeW1class07 {
    public static String url = " https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String mainPage = driver.getWindowHandle();
        System.out.println("main handle =" + mainPage);

        WebElement tab = driver.findElement(By.id("tabButton"));
        tab.click();
        System.out.println(tab.getText());
        WebElement window = driver.findElement(By.id("windowButton"));
        window.click();
        System.out.println(window.getText());
        WebElement message = driver.findElement(By.id("messageWindowButton"));
        message.click();
        System.out.println(message.getText());

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("all wind size =" + allWindows.size());

        Iterator<String> it = allWindows.iterator();
        while (it.hasNext()) {
            String handle = it.next();

            String title = driver.getTitle();
            System.out.println(title);

        }


    }
}
