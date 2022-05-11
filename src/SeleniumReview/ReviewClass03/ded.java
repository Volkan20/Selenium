package SeleniumReview.ReviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ded {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        //HW1
        //Go to facebook sign up page
        //Fill out the whole form
        //Click signup

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);
        WebElement createNewAccount = driver.findElement(By.partialLinkText("Create New Account"));
        createNewAccount.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("medine");
        //Locating by CSS Selector - Tag and Attribute syntax==> tagName[attribute='value']
        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("kaya");
        //Locating by CSS Selector - Tag and Attribute syntax==> tagName[attribute='value']
        WebElement number = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        number.sendKeys("209209219");
        WebElement password = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        password.sendKeys("HayrOla123");
        WebElement month = driver.findElement(By.cssSelector("select[name='birthday_month']"));
        Select selectMonth = new Select(month);
        if (!selectMonth.isMultiple()) {
            selectMonth.selectByValue("3");
        }
        WebElement day = driver.findElement(By.cssSelector("select[name='birthday_day']"));
        Select selectday = new Select(day);
        if (!selectday.isMultiple()) {
            selectday.selectByValue("30");
        }
        WebElement year = driver.findElement(By.cssSelector("select[name='birthday_year']"));
        Select selectyear = new Select(year);
        if (!selectyear.isMultiple()) {
            selectyear.selectByValue("1993");
        }
        List<WebElement> genderCheckBox = driver.findElements(By.name("sex"));
        int size = genderCheckBox.size();
        System.out.println(size);
        for (WebElement gender : genderCheckBox) {
            String text = gender.getAttribute("value");
            if (text.equals("1")) {
                gender.click();
                break;
            }
        }
    }
}

