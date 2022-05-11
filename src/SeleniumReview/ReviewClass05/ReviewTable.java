package SeleniumReview.ReviewClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReviewTable {
    public static String url = "https://www.techlistic.com/p/demo-selenium-practice.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // accessing the whole webtable
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        // print the table
        System.out.println(wholeTable.getText());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String text = row.getText();
            if (text.contains("Germany")) {
                System.out.println(text);
            }
        }

    }
}