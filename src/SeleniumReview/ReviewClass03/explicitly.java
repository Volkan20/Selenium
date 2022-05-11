package SeleniumReview.ReviewClass03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitly {
    public static String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}