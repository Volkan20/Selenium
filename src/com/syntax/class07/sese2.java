package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class sese2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTab.click();
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        Iterator<String> iterator = allWindow.iterator();
        while (iterator.hasNext()) {
            String a = iterator.next();
            if (!mainWindow.equals(a)) {
                driver.switchTo().window(a);
                WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println(text.getText());
                driver.switchTo().window(mainWindow);
                Thread.sleep(5000);
            }
        }
        WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
        newWindow.click();
        String mainWindow1 = driver.getWindowHandle();
        Set<String> allWindow1 = driver.getWindowHandles();
        Iterator<String> iterator1 = allWindow.iterator();
        while (iterator1.hasNext()) {
            String b = iterator1.next();
            if (!mainWindow1.equals(b)) {
                driver.switchTo().window(b);
                WebElement text1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
                System.out.println(text1.getText());
            }
        }
        WebElement newWindowMwssage = driver.findElement(By.xpath("//button[@type='button'and@id='messageWindowButton']"));
        newWindowMwssage.click();
        String mainWindow2 = driver.getWindowHandle();
        Set<String> allWindow2 = driver.getWindowHandles();
        Iterator<String> iterator2 = allWindow.iterator();
        while (iterator2.hasNext()) {
            String c = iterator2.next();
            if (!mainWindow2.equals(c)) {
                driver.switchTo().window(c);
                WebElement text2 = driver.findElement(By.xpath("//body"));
                System.out.println(text2.getText());

            }
        }
    }
}

