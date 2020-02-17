package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpPage extends PageBaseMobile {

    private final String USERNAME_INPUT_ACCESSIBILITY_ID = "usernameInputSignUp";
    private final String EMAIL_ADDRESS_INPUT_ACCESSIBILITY_ID = "emailAddressInputSignUp";
    private final String PASSWORD_INPUT_ACCESSIBILITY_ID = "passwordInputSignUp";
    private final String SIGN_UP_BUTTON_ACCESSIBILITY_ID = "signUpButtonSignUp";

    public SignUpPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setEmailAddress(String emailAddress) {
       completeField(MobileBy.AccessibilityId(EMAIL_ADDRESS_INPUT_ACCESSIBILITY_ID), emailAddress);
    }

    public void setUsername(String username) {
        completeField(MobileBy.AccessibilityId(USERNAME_INPUT_ACCESSIBILITY_ID), username);
    }

    public void setPassword(String password) {
        completeField(MobileBy.AccessibilityId(PASSWORD_INPUT_ACCESSIBILITY_ID), password);
    }

    public void clickSignUpButton() {
        clickElement(MobileBy.AccessibilityId(SIGN_UP_BUTTON_ACCESSIBILITY_ID));
    }
}
