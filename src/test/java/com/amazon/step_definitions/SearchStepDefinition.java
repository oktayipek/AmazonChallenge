package com.amazon.step_definitions;

import com.amazon.pages.YourAmazon;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchStepDefinition {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user should be able to enter {string}")
    public void the_user_should_be_able_to_enter(String searchKey) {
        new YourAmazon().searchBox.sendKeys(searchKey);
        new YourAmazon().searchSubmitButton.click();
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String expectedResult) {
        String actualResult = new YourAmazon().searchResult.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
