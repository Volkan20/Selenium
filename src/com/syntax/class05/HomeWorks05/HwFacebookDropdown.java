package com.syntax.class05.HomeWorks05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//Facebook dropdown verification
//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser
public class HwFacebookDropdown {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);
//verify month dd has 12 months
        WebElement month = driver.findElement(By.cssSelector("select[id = 'month']"));
        Select monthDD = new Select(month);
        List<WebElement> monthOptions = monthDD.getOptions();
        int sizeM = monthOptions.size();
        if (sizeM == 12) {
            System.out.println("Size Months = " + sizeM + " months");
        }
//verify day dd has 21 days
        WebElement day = driver.findElement(By.id("day"));
        Select dayDD = new Select(day);
        List<WebElement> dayOptions = dayDD.getOptions();
        int sizeD = dayOptions.size();
        if (sizeD == 31) {
            System.out.println("Size Days = " + sizeD + " days");
        }
//verify year dd has 115 years
        WebElement year = driver.findElement(By.id("year"));
        Select yearDD = new Select(year);
        List<WebElement> yearOptions = yearDD.getOptions();
        int sizeY = yearOptions.size();
        if (sizeY == 115) {
            System.out.println("Size Years = " + sizeY + " years");
        } else {
            System.out.println("Size Year doesn't have 115 years instead it ahs =" + sizeY);
        }
        Thread.sleep(2000);
//select your Bday
        monthDD.selectByValue("5");
        Thread.sleep(1000);
        dayDD.selectByIndex(16);
        Thread.sleep(1000);
        yearDD.selectByVisibleText("1994");
        Thread.sleep(3000);
        driver.quit();

    }
}


