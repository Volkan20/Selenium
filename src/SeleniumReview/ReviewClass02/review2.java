package SeleniumReview.ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femalebtn = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
        //check if the radio btn is enable
        System.out.println("The female radio btn is enable = " + femalebtn.isEnabled());
        //check if the radio btn female is displayed
        System.out.println("The female radio btn is displayed = " + femalebtn.isDisplayed());
        //check if the radio btn female is selected or not
        System.out.println("The female radio btn is selected = " + femalebtn.isSelected());
//check if the btn is not selected and select it
        if (!femalebtn.isSelected()) {
            femalebtn.click();
        }
        //check the status of selection again
        System.out.println("The female radio btn is selected = " + femalebtn.isSelected());

        // to get all the links in th ecurrent webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String name = link.getText();
            if (!name.isEmpty()) {
                System.out.println(name);
            }
        }

        driver.quit();


    }
}
