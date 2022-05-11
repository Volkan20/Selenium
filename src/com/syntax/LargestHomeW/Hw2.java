package com.syntax.LargestHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
//    TC 2: HRMS blank username and password validation
//    Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//    Leave username and password field empty
//    Click on login button
//    Verify error message with text "Username cannot be empty" is displayed

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.id("btnLogin")).click();
        WebElement text = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String verify = text.getText();

        System.out.println(text.isDisplayed());
        if (verify.equals("Username cannot be empty")) {
            System.out.println("Text is Correct.!");
        }

    }
}
