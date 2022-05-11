package com.syntax.zpages;

import com.syntax.zutils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithpageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    public LoginPageWithpageFactory() {
        PageFactory.initElements(driver, this);
    }

}