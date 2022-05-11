package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and password (username - Admin, password - Hum@nhrm123)
//Click on login button
//Then verify Syntax Logo is displayed.
public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
        username.click();
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();

        WebElement syntax = driver.findElement(By.xpath("//img[starts-with(@src,human)]"));
        boolean display = syntax.isDisplayed();
        if (display) {
            System.out.println("Syntax Logo is Displayed");
        } else {
            System.out.println("Logo didn't Displayed");
        }
        driver.quit();
    }
}
