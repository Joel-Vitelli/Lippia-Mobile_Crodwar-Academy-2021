package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ApiDemoHome extends PageBaseMobile {

    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TEXT_VIEW_XPATH = "//android.widget.TextView";

    public ApiDemoHome(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getTitle() {
        return getWebElement(By.xpath(ACTION_BAR_XPATH)).findElement(By.xpath(TEXT_VIEW_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getWebElement(By.xpath("//android.widget.TextView[@content-desc=" + "\"" + menu + "\"" + "]"));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        clickElement(element);
    }

}
