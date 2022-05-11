package SeleniumReview.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.ThemeReader;

import java.util.List;

public class dropDown {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();

        //get the desired dropdow
        Thread.sleep(2000);
        WebElement daysOptions = driver.findElement(By.cssSelector("select#day"));
//use selenium select dropdown
        Select days = new Select(daysOptions);
        days.selectByValue("5");
        Thread.sleep(2000);
        days.selectByIndex(0);
        Thread.sleep(2000);
        days.selectByVisibleText("25");

        //print all the options of the dropdown
        //get all the options using select class
        List<WebElement> options = days.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
            //other way to get all options--> option.getAttribute("value");

            System.out.println("Yenis");

        }


    }
}
