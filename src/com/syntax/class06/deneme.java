package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deneme {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");
        driver.switchTo().frame("FrameTwo");
        WebElement enroll = driver.findElement(By.xpath("//div[@class = 'text-block-2']"));
        Thread.sleep(2000);

        if (enroll.isEnabled()) {
            System.out.println("Erolllll");
        } else {
            System.out.println("Olipessss");
        }

        driver.switchTo().frame("FrameOne");
        WebElement sorry = driver.findElement(By.xpath("//h1[@class='heading-13']"));
        sorry.getText();
        if (sorry.equals("Sorry, We Couldn't Find Anything For “Asksn”")) {
            System.out.println("Sonundaa");
        } else {
            System.out.println("Sonmayinda");
        }


    }
}
