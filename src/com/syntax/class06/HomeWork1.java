package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to https://syntaxprojects.com/bootstrap-iframe.php
//verify the header text "Sorry, We Couldn't Find Anything For "Asksn" " is displayed
//verify enroll today button is enabled
public class HomeWork1 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        driver.switchTo().frame("FrameTwo");
        WebElement enrol = driver.findElement(By.className("text-block-2"));
        // enrol.click();
        if (enrol.isEnabled()) {
            System.out.println("Enrol Button is Enable");
        } else {
            System.out.println("Enrol Button is Error.!");
        }
        driver.switchTo().defaultContent();

       /* driver.switchTo().frame(1);
        Thread.sleep(2000);
        driver.findElement(By.)
        WebElement textSorry = driver.findElement(By.className("heading-13"));
        String textVerify = textSorry.getText();
        if(textSorry.equals("Sorry, We Couldn't Find Anything For \"Asksn\"")){
            System.out.println("Verifying is CORRECT.!");
        }else{
            System.out.println("Can't Verifyed");
        }
        */


    }
}
