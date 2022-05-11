package SeleniumReview.pages;

import com.syntax.zutils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends CommonMethods {

    public WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
    public WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
    public WebElement loginButton = driver.findElement(By.className("button"));

}