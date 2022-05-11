package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo3 {
    public static String url = "https://www.google.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open(https://www.amazon.com);");//opens a new tab and navigate to amazon
        //window.open(); -- open a blank tab
        driver.get(url);

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("volkanvolkanvolkan");


    }
}
