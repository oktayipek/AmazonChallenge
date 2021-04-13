package com.amazon.step_definitions;

import com.amazon.pages.SearchPage;
import com.amazon.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchStepDefinitionWithPrice {

    @When("the user should be able to enter {string} and search")
    public void the_user_should_be_able_to_enter_and_search(String product) {
        new SearchPage().searchBox.sendKeys(product);
        new SearchPage().searchSubmitButton.click();
    }

    @When("the user should be able to choose {string} and {string} price")
    public void the_user_should_be_able_to_choose_and_price(String minPrice, String maxPrice) {
        SearchPage searchPage = new SearchPage();
        searchPage.lowPrice.sendKeys(minPrice);
        searchPage.highPrice.sendKeys(maxPrice);
        searchPage.goButton.click();
    }

    @Then("the user should see {int} price and {int} price")
    public void the_user_should_see_price_and_price(Integer minPrice, Integer maxPrice) {
        List<Integer> prices = new ArrayList<>();
        List<String> priceLists = new ArrayList<>();
        boolean flag=true;

//        while(flag){
//
//            priceLists = BrowserUtils.getElementsText(new SearchPage().productPrices);
//
//            if (new SearchPage().nextButton.isEnabled()){
//                new SearchPage().nextButton.click();
//            }else{
//                flag=false;
//                break;
//            }
//        }

        do {
            priceLists = BrowserUtils.getElementsText(new SearchPage().productPrices);
            if (new SearchPage().nextButton.isDisplayed() || new SearchPage().nextButton.isEnabled()){
                new SearchPage().nextButton.click();
            }else{
                flag=false;
            }
        }while (flag);

        Collections.sort(priceLists);

        for (int i = 0; i < priceLists.size(); i++) {
            prices.add(Integer.parseInt(priceLists.get(i)));
        }

        int k=1;
        for (Integer price : prices) {
            System.out.println("price "+k+" = " + price);
            k++;
        }

    }
}