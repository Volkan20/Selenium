package SeleniumReview.ReviewClass03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //find the alert and click on it
        WebElement SimpleAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        SimpleAlert.click();

        //handling the alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        WebElement jsalert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        jsalert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();

        Thread.sleep(2000);
        alert.sendKeys("Hello World");
        alert.accept();

    }
}
