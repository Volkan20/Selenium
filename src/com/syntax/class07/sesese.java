package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class sesese {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);
        WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTab.click();
        WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
        newWindow.click();
        WebElement newWindowMwssage = driver.findElement(By.xpath("//button[@type='button'and@id='messageWindowButton']"));
        newWindowMwssage.click();
        Set<String> allwindowHnadles = driver.getWindowHandles();
        System.out.println(allwindowHnadles.size());
        Iterator<String> it = allwindowHnadles.iterator();
        while (it.hasNext()) {
            String childHandle = it.next();
            if (!mainPageHandle.equals(childHandle)) {
                driver.switchTo().window(childHandle);

                WebElement a = driver.findElement(By.xpath("//body"));
                System.out.println(a.getText());


            }

        }

        String title = driver.getTitle();
        System.out.println(title);

    }
}

