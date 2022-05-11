package com.syntax.zpages;

import com.syntax.zutils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.syntax.ztestBase.BaseClass.driver;

public class DashboardPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}