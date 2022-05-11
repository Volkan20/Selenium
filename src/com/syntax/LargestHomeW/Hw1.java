package com.syntax.LargestHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 1: HRMS blank password validation
//Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed

public class Hw1 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Volkan");
        driver.findElement(By.id("btnLogin")).click();

        WebElement text = driver.findElement(By.id("spanMessage"));
        String texy = text.getText();
        System.out.println(texy);

        System.out.println(text.isDisplayed());

        if (texy.equals("Password cannot be empty")) {
            System.out.println("Text verify is Works..");
        }


    }
}
