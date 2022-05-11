package com.syntax.Pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWorkCalenderHandling {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leaveBtn = driver.findElement(By.xpath("//b[text() = 'Leave']"));
        leaveBtn.click();
        driver.findElement(By.xpath("//a[text() = 'Leave List']")).click();
        WebElement fromDate = driver.findElement(By.id("calFromDate"));
        fromDate.click();

        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByValue("4");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : dates) {
            String dateText = date.getText();
            if (dateText.equals("17")) {
                date.click();
                break;
            }

        }

        driver.findElement(By.xpath("//label[text()='Cancelled']")).click();
        driver.findElement(By.xpath("//label[text()='Rejected']")).click();
        driver.findElement(By.xpath("//label[text()='Pending Approval']")).click();

        WebElement subUnit = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select1 = new Select(subUnit);
        select1.selectByVisibleText("IT Support");

        driver.findElement(By.id("btnSearch")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}
