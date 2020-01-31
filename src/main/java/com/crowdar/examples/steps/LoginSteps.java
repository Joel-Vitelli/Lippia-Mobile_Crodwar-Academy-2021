package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ApiDemoHome;
import com.crowdar.examples.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps extends PageSteps {

    @Given("The app is loaded correctly")
    @Then("Login page is displayed")
    public void isLoginPageVisible(){
        Injector._page(LoginPage.class).waitLoginPageAppears();
        Assert.assertTrue(Injector._page(LoginPage.class).isLoginPageVisible(), "Login page is not displayed.");
    }

    @When("The user goes to the Sign Up page")
    public void goToSignUp() {
        Injector._page(LoginPage.class).clickSignUpButton();
    }

    @When("The user logs in the application with: (.*), (.*)")
    public void doLoginProcess(String email, String password) {
        Injector._page(LoginPage.class).setEmailAddress(email);
        Injector._page(LoginPage.class).setPassword(password);
        Injector._page(LoginPage.class).clickSignInButton();
    }

}
