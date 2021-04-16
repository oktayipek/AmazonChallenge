package com.amazon.step_definitions;

import com.amazon.pages.miroLoginPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class miroLoginStepDef {

    @Given("the user is on the Miro login page")
    public void the_user_is_on_the_Miro_login_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("miro_url"));
    }

    @When("the Miro user enters {string} and {string} information")
    public void the_Miro_user_enters_and_information(String work_email, String password) {
        new miroLoginPage().LoginWithoutSSO(work_email, password);
    }

    @Then("the user should be on {string} page")
    public void the_user_should_be_on_page(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
