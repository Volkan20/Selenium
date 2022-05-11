package SeleniumReview.test;

import SeleniumReview.testBase.BaseClass;
import com.syntax.zpages.LoginPage;

public class LoginPageTest {
    public static void main(String[] args) {
//calling the method openWithSpecificUrl from the base
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //create an object of the class that has your required WebElements
        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys("Admin");
        loginPage.password.sendKeys("Hum@nhrm123");
        loginPage.loginButton.click();

        BaseClass.tearDown();

    }
}
