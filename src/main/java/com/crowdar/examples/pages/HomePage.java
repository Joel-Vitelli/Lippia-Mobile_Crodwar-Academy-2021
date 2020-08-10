package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends PageBaseMobile {

    public HomePage(RemoteWebDriver driver) {
        super(driver);
    }

    public void setPhoneNumber(String phoneNumber) {
        setInput("phoneInput", phoneNumber);
    }

    public void clickCameraButton() {
        click("cameraButton");
    }

    public void clickChangeLanguageButton() {
        click("changeLanguageButton");
    }

    public void clickSignOutButton() {
        click("signOutButton");
    }

    public void waitHomePageAppears() {
        waitVisibility("signOutButton");
    }

    public boolean isHomePageVisible() {
        return isVisible("changeLanguageButton");
    }
}
