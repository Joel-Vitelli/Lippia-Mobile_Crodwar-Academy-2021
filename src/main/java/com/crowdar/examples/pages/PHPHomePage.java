package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PHPHomePage extends PageBaseMobile {

    public static final String HOME_IMAGE_ID = "com.phptravelsnative:id/image";
    public static final String MENU_BTN_ID = "com.phptravelsnative:id/naviIcon";
    public static final String CONTACT_UD_BTN_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]";

    public PHPHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void checkHome(){
        waitForElementVisibility(By.id(HOME_IMAGE_ID));
        Assert.assertTrue(isElementPresent(By.id(HOME_IMAGE_ID)), "No se encuentra el Home");
    }

    public void tapMenu(){
        clickElement(By.id(MENU_BTN_ID));
    }

    public void tapContactUs(){
        clickElement(By.xpath(CONTACT_UD_BTN_XPATH));
    }

}
