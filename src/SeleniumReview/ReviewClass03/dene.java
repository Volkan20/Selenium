package SeleniumReview.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class dene {
    public static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement btn = driver.findElement(By.id("startButton"));
        btn.click();

        WebElement welcomeMsj = driver.findElement(By.xpath("//*[contains(text(), 'Welcome Syntax')]"));
        System.out.println(welcomeMsj.getText());

    }
}