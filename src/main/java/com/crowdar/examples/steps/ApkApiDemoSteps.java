package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ApiDemoHome;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ApkApiDemoSteps extends PageSteps {

    @Given("The user opens the '(.*)' application")
    public void openAplication(String title) {
        Assert.assertEquals(Injector._page(ApiDemoHome.class).getTitle(), title);
    }

    @When("The user clicks over '(.*)' menu element")
    public void executeAction(String menuElementName) {
        Injector._page(ApiDemoHome.class).clickMenuElement(menuElementName);
    }

    @Then("The user sees the application '(.*)' open")
    public void openAssertion(String title) throws InterruptedException {
        Thread.sleep(1500l);
        Assert.assertEquals(Injector._page(ApiDemoHome.class).getTitle(), title);
    }
}
