package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAmazon extends BasePage{

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement helloName;

}
