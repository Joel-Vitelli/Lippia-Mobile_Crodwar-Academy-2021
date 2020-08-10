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
        click("signInButton");
    }

    public void clickSignUpButton() {
        click("signUpButton");
    }

    public void waitLoginPageAppears(){
        waitVisibility("signInButton");
    }

    public boolean isLoginPageVisible(){
        return isVisible("signInButton");
    }
}
