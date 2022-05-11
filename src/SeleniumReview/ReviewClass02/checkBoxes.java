package SeleniumReview.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //check the check box
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected = " + checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(3000);
        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.getText());

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }


    }
}
