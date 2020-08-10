package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends PageBaseMobile {
    private final String SIGN_IN_BUTTON_LOCATOR = "signInButton" + DriverManager.getName();

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void setEmailAddress(String emailAddress) {
        setInput("emailInput", emailAddress);
    }

    public void setPassword(String password) {
        setInput("passwordInput", password);
    }

    public void clickSignInButton() {
        click(SIGN_IN_BUTTON_LOCATOR);
    }

    public void clickSignUpButton() {
        click("signUpButton");
    }

    public void waitLoginPageAppears(){
        waitVisibility(SIGN_IN_BUTTON_LOCATOR);
    }

    public boolean isLoginPageVisible(){
        return isVisible(SIGN_IN_BUTTON_LOCATOR);
    }
}
