package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //we need to switch our focus to frame first
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.id("name")); //identify(tanimlamak)
        textbox.sendKeys("Batch 12 Forever!!");
        //also after frame we need to switch back to driver(default) manually
        driver.switchTo().defaultContent();

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();

        Thread.sleep(2000);
        //and we need to switch our focus to Alert again but Alert can switch back to drive automatically
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.switchTo().frame("iframe_a");
        textbox.clear();     //--> for send second text, we need to clear it first
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent();//after frame we need switch back to default again manually

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src ='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your Horses");


    }

}
