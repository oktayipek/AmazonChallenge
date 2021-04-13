package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(id = "low-price")
    public WebElement lowPrice;

    @FindBy(id = "high-price")
    public WebElement highPrice;

    @FindBy(id = "a-autoid-1")
    public WebElement goButton;

    @FindBy (className = "a-price-whole")
    public List<WebElement> productPrices;

    @FindBy(css = ".a-pagination>.a-last")
    public WebElement nextButton;


}
