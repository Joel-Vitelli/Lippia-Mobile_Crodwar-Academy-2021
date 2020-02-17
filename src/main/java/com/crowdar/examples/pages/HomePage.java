package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends PageBaseMobile {

    private final String PHONE_NUMBER_INPUT_ACCESSIBILITY_ID = "phoneInputHome";
    private final String CAMERA_BUTTON_ACCESSIBILITY_ID = "cameraButtonHome";
    private final String CHANGE_LANGUAGE_BUTTON_ACCESSIBILITY_ID = "changeLanguageButtonHome";
    private final String SIGN_OUT_BUTTON_ACCESSIBILITY_ID = "signOutButtonHome";

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void setPhoneNumber(String phoneNumber) {
       completeField(MobileBy.AccessibilityId(PHONE_NUMBER_INPUT_ACCESSIBILITY_ID), phoneNumber);
    }

    public void clickCameraButton() {
        clickElement(MobileBy.AccessibilityId(CAMERA_BUTTON_ACCESSIBILITY_ID));
    }

    public void clickChangeLanguageButton() {
        clickElement(MobileBy.AccessibilityId(CHANGE_LANGUAGE_BUTTON_ACCESSIBILITY_ID));
    }

    public void clickSignOutButton() {
        clickElement(MobileBy.AccessibilityId(SIGN_OUT_BUTTON_ACCESSIBILITY_ID));
    }

    public void waitHomePageAppears(){
        waitForElementVisibility(MobileBy.AccessibilityId(SIGN_OUT_BUTTON_ACCESSIBILITY_ID));
    }

    public boolean isHomePageVisible() {
        return isElementVisible(MobileBy.AccessibilityId(CHANGE_LANGUAGE_BUTTON_ACCESSIBILITY_ID));
    }
}
