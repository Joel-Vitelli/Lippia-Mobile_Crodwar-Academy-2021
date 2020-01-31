package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends PageBaseMobile {

    private final String EMAIL_ADDRESS_INPUT_XPATH = "//*[@content-desc='emailAddressInputLogin']";
    private final String PASSWORD_INPUT_XPATH = "//*[@content-desc='passwordInputLogin']";
    private final String SIGN_IN_BUTTON_XPATH = "//*[@content-desc='signInButtonLogin']";
    private final String SIGN_UP_BUTTON_XPATH = "//*[@content-desc='signUpButtonLogin']";

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setEmailAddress(String emailAddress) {
       completeField(MobileBy.xpath(EMAIL_ADDRESS_INPUT_XPATH), emailAddress);
    }

    public void setPassword(String password) {
        completeField(MobileBy.xpath(PASSWORD_INPUT_XPATH), password);
    }

    public void clickSignInButton() {
        clickElement(MobileBy.xpath(SIGN_IN_BUTTON_XPATH));
    }

    public void clickSignUpButton() {
        clickElement(MobileBy.xpath(SIGN_UP_BUTTON_XPATH));
    }

    public void waitLoginPageAppears(){
        waitForElementVisibility(MobileBy.xpath(SIGN_UP_BUTTON_XPATH));
    }

    public boolean isLoginPageVisible(){
        return isElementVisible(MobileBy.xpath(SIGN_IN_BUTTON_XPATH));
    }
}
