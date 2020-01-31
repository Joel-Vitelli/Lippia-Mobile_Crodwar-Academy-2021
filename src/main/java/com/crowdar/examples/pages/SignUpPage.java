package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpPage extends PageBaseMobile {

    private final String USERNAME_INPUT_XPATH = "//*[@content-desc='usernameInputSignUp']";
    private final String EMAIL_ADDRESS_INPUT_XPATH = "//*[@content-desc='emailAddressInputSignUp']";
    private final String PASSWORD_INPUT_XPATH = "//*[@content-desc='passwordInputSignUp']";
    private final String SIGN_UP_BUTTON_XPATH = "//*[@content-desc='signUpButtonSignUp']";

    public SignUpPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setEmailAddress(String emailAddress) {
       completeField(MobileBy.xpath(EMAIL_ADDRESS_INPUT_XPATH), emailAddress);
    }

    public void setUsername(String username) {
        completeField(MobileBy.xpath(USERNAME_INPUT_XPATH), username);
    }

    public void setPassword(String password) {
        completeField(MobileBy.xpath(PASSWORD_INPUT_XPATH), password);
    }

    public void clickSignUpButton() {
        clickElement(MobileBy.xpath(SIGN_UP_BUTTON_XPATH));
    }
}
