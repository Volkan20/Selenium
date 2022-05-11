package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Deneme {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement account = driver.findElement(By.xpath("//?ref_=nav_cs_newreleases"));

        Actions action = new Actions(driver);
        action.moveToElement(account).perform();

        WebElement element = driver.findElement(By.xpath("https://www.amazon.com/gp/new-releases/?ref_=nav_cs_newreleases"));

        if (element.getText().contains("Start")) {
            System.out.println("Menu displayed");
        } else {
            System.out.println("Menu did NOT display");
        }

        action.contextClick(element).perform();

        WebElement searchBox = driver.findElement(By.xpath("https://www.amazon.com/gp/new-releases/?ref_=nav_cs_newreleases"));

        action.moveToElement(searchBox).click().sendKeys("Movies").perform();

        searchBox.submit();

        Thread.sleep(5000);

        driver.quit();


    }
}
