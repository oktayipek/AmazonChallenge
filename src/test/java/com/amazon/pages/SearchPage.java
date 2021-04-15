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

    @FindBy (xpath = "(//div[@class='s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col sg-col-12-of-16']//span[@class='a-price-whole'])")
    public List<WebElement> productPrices;


    @FindBy(xpath = "(//div[@class='a-section a-spacing-none a-padding-base']//li[contains(@class,'a-last')])")
    public WebElement nextButton;


}
