package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.LoginPage;
import com.crowdar.examples.pages.SignUpPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SignUpSteps extends PageSteps {

    @When("The user registers a new user with: (.*), (.*), (.*)")
    public void doSignUpProcess(String username, String email, String password) {
        Injector._page(SignUpPage.class).setUsername(username);
        Injector._page(SignUpPage.class).setEmailAddress(email);
        Injector._page(SignUpPage.class).setPassword(password);
        Injector._page(SignUpPage.class).clickSignUpButton();
    }

}
