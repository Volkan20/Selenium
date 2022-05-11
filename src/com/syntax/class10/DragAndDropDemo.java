package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//switching our focus to Iframe because drag&drop in Iframe
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        //creating Action class to work with action
        Actions action = new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform(); ->just one action
        //if we have more than one actions we need to use 'build' method
        action.clickAndHold(draggable).moveToElement(draggable).release().build().perform();


    }
}
