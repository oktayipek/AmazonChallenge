package com.amazon.step_definitions;

import com.amazon.pages.LoginPage;
import com.amazon.pages.YourAmazon;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(5000);
        new LoginPage().GoToSingPage();
    }

    @When("the user enters {string} and {string} information")
    public void the_user_enters_and_information(String email, String password) {
        new LoginPage().LogingAsUser(email,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        String expectedName ="Hello, oktay";
        String actualName =new YourAmazon().helloName.getText().trim();

        Assert.assertEquals(expectedName,actualName);
    }
}
