package com.crowdar.examples.pages;

import com.crowdar.bdd.cukes.SharedDriver;
import com.crowdar.core.CucumberPageBase;
import com.crowdar.mobile.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseExamples extends PageBase {

    public PageBaseExamples(SharedDriver driver){
        super(driver);
        BASE_URL = "http://www.google.com.ar";
    }


}
