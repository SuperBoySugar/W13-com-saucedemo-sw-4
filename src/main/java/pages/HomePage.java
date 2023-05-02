package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class HomePage extends Utility {

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");


    // Enter username
    public void enterUserName(String name) {
        sendTextToElement(userName, name);
    }

    // Enter Password
    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
    }

    // Click on Login Button
    public void clickOnLoginButton() {
        pmClickOnElement(loginBtn);
    }

}
