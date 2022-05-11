package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWParaBank {
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Volkan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Dereli");
        driver.findElement(By.id("customer.address.street")).sendKeys("17 Lincoln");
        driver.findElement(By.id("customer.address.city")).sendKeys("Pleasantville");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10570");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("856-587 2369");
        driver.findElement(By.id("customer.ssn")).sendKeys("253-695-5874");

        WebElement username = driver.findElement(By.id("customer.username"));
        username.sendKeys("Mr.Smokin");

        WebElement password = driver.findElement(By.id("customer.password"));
        password.sendKeys("smokin");
        driver.findElement(By.id("repeatedPassword")).sendKeys("smokin");

        driver.findElement(By.className("button")).click();
        driver.findElement(By.name("username")).sendKeys("Mr.Smokin");
        driver.findElement(By.name("password")).sendKeys("smokin");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        driver.quit();
    }

}
