package com.syntax.ztest;

import com.syntax.zpages.LoginPage;
import com.syntax.ztestBase.BaseClass;

public class LoginPageTest {

    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Tester");
        loginPage.password.sendKeys("test");
        loginPage.loginButton.click();


    }
}
