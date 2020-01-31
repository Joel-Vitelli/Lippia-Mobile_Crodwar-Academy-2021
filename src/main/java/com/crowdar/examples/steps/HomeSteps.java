package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.HomePage;
import com.crowdar.examples.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        Injector._page(HomePage.class).waitHomePageAppears();
        Assert.assertTrue(Injector._page(HomePage.class).isHomePageVisible(), "Home page is not displayed.");
    }

    @When("The user changes the language")
    public void doChangeLanguage() {
        Injector._page(HomePage.class).clickChangeLanguageButton();
    }

    @When("The user log out of the app")
    public void doSignOut() {
        Injector._page(HomePage.class).clickSignOutButton();
    }

}
