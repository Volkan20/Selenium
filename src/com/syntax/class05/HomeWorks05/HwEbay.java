package com.syntax.class05.HomeWorks05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;

//Go to ebay.com
//get all the categories and print them in the console
//select Computers/Tables & Networking
//click on search
//verify the header
public class HwEbay {
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement categoriesDD = driver.findElement(By.id("gh-cat"));
        Select select = new Select(categoriesDD);

        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            String optionText = option.getText();
            System.out.println(optionText);
        }
        select.selectByVisibleText("Computers/Tablets & Networking");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);


//driver.quit();

    }
}
