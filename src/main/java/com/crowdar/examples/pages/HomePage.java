package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends PageBaseMobile {

    private final String PHONE_NUMBER_INPUT_XPATH = "//*[@content-desc='phoneInputHome']";
    private final String CAMERA_BUTTON_XPATH = "//*[@content-desc='cameraButtonHome']";
    private final String CHANGE_LANGUAGE_BUTTON_XPATH = "//*[@content-desc='changeLanguageButtonHome']";
    private final String SIGN_OUT_BUTTON_XPATH = "//*[@content-desc='signOutButtonHome']";

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setPhoneNumber(String phoneNumber) {
       completeField(MobileBy.xpath(PHONE_NUMBER_INPUT_XPATH), phoneNumber);
    }

    public void clickCameraButton() {
        clickElement(MobileBy.xpath(CAMERA_BUTTON_XPATH));
    }

    public void clickChangeLanguageButton() {
        clickElement(MobileBy.xpath(CHANGE_LANGUAGE_BUTTON_XPATH));
    }

    public void clickSignOutButton() {
        clickElement(MobileBy.xpath(SIGN_OUT_BUTTON_XPATH));
    }

    public void waitHomePageAppears(){
        waitForElementVisibility(MobileBy.xpath(SIGN_OUT_BUTTON_XPATH));
    }

    public boolean isHomePageVisible() {
        return isElementVisible(MobileBy.xpath(CHANGE_LANGUAGE_BUTTON_XPATH));
    }
}
