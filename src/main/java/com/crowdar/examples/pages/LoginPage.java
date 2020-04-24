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

    private final String EMAIL_ADDRESS_INPUT_ACCESSIBILITY_ID = "emailAddressInputLogin";
    private final String PASSWORD_INPUT_ACCESSIBILITY_ID = "passwordInputLogin";
    private final String SIGN_IN_BUTTON_ACCESSIBILITY_ID = "signInButtonLogin";
    private final String SIGN_UP_BUTTON_ACCESSIBILITY_ID = "signUpButtonLogin";

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setEmailAddress(String emailAddress) {
       completeField(MobileBy.AccessibilityId(EMAIL_ADDRESS_INPUT_ACCESSIBILITY_ID), emailAddress);
    }

    public void setPassword(String password) {
        completeField(MobileBy.AccessibilityId(PASSWORD_INPUT_ACCESSIBILITY_ID), password);
    }

    public void clickSignInButton() {
        clickElement(MobileBy.AccessibilityId(SIGN_IN_BUTTON_ACCESSIBILITY_ID));
    }

    public void clickSignUpButton() {
        clickElement(MobileBy.AccessibilityId(SIGN_UP_BUTTON_ACCESSIBILITY_ID));
    }

    public void waitLoginPageAppears(){
        waitForElementVisibility(MobileBy.AccessibilityId(SIGN_UP_BUTTON_ACCESSIBILITY_ID));
    }

    public boolean isLoginPageVisible(){
        return isElementVisible(MobileBy.AccessibilityId(SIGN_IN_BUTTON_ACCESSIBILITY_ID));
    }
}
