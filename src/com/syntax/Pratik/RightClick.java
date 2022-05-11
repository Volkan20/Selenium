package com.syntax.Pratik;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.metal.MetalBorders;

public class RightClick {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rclick).perform();

        WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
        action.click(cut).perform();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        driver.quit();


    }
}
