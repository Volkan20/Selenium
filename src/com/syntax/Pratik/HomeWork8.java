package com.syntax.Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork8 {
//    go to https://the-internet.herokuapp.com/dynamic_controls
//    click on checkbox and click on remove
//    verify the text
//    click on enable verify the textbox is enabled
//    enter text and click disable
//    verify the textbox is disabled

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        WebElement text = driver.findElement(By.id("message"));
        System.out.println(text.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Enable']")));
        WebElement enable = driver.findElement(By.xpath("//*[text()='Enable']"));
        enable.click();

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("volkan");
        driver.findElement(By.xpath("//button[text()='Disable']")).click();


    }

}
