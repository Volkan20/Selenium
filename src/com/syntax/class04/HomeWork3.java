package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HRMS Application Negative Login:
//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed.
public class HomeWork3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        WebElement error = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        if (error.isDisplayed()) {
            System.out.println("Checking is Completed");
        }
        driver.quit();

    }
}
