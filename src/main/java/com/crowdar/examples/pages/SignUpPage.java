package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpPage extends PageBaseMobile {

    public SignUpPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void setEmailAddress(String emailAddress) {
        setInput("emailInput", emailAddress);
    }

    public void setUsername(String username) {
        setInput("usernameInput", username);
    }

    public void setPassword(String password) {
        setInput("passwordInput", password);
    }

    public void clickSignUpButton() {
        click("signUpButton");
    }
}
