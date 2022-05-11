package com.syntax.LargestHomeW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    //    TC 2: HRMS invalid credentials validation
//    Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//    Enter valid username and wrong password
//    Click on login button
//    Verify error message with text "Invalid credentials" is displayed
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Volkan");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Volkan");

        driver.findElement(By.id("btnLogin")).click();

        WebElement text = driver.findElement(By.id("spanMessage"));
        System.out.println(text.isDisplayed());

        String texy = text.getText();
        if (texy.equals("Invalid credentials")) {
            System.out.println("Correct.! Text is = " + texy);
        }
    }
}
