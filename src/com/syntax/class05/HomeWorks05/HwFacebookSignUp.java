package com.syntax.class05.HomeWorks05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Go to facebook sign up page
//Fill out the whole form
//Click signup
public class HwFacebookSignUp {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("volkan");
        driver.findElement(By.name("lastname")).sendKeys("dereli");
        driver.findElement(By.name("reg_email__")).sendKeys("volkan@volkan.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("asddsa");

        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement year = driver.findElement(By.id("year"));

        Select month1 = new Select(month);
        Select day1 = new Select(day);
        Select year1 = new Select(year);

        month1.selectByVisibleText("May");
        Thread.sleep(2000);
        day1.selectByVisibleText("17");
        year1.selectByVisibleText("1994");

        driver.findElement(By.name("type")).click();
        driver.findElement(By.name("websubmit")).click();


    }

}
