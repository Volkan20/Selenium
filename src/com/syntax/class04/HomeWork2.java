package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Amazon link count:
//Open chrome browser
//Go to "https://www.amazon.com/"
//Get all links
//Get number of links that has text
//Print to console only the links that has text
public class HomeWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("Number of links= " + link.size());

        for (WebElement links : link) {
            String linkText = links.getText();
            String allLinks = links.getAttribute("href");
            if (!linkText.isEmpty()) {
                System.out.println(linkText + "    " + allLinks);
            }
        }
        driver.quit();
    }
}
