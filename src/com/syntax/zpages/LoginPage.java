package com.syntax.zpages;

import com.syntax.zutils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.syntax.ztestBase.BaseClass.driver;

public class LoginPage extends CommonMethods {

    public WebElement username = driver.findElement(By.id("txtUsername"));
    public WebElement password = driver.findElement(By.id("txtPassword"));
    public WebElement loginButton = driver.findElement(By.id("btnLogin"));

}
