package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class miroSSOloginPage extends miroLoginPage{

    @FindBy(xpath = ("//button[@data-autotest-id='mr-form-sso-btn-signin-1']"))
    public WebElement miroSSOsignInButton;

    @FindBy(xpath = ("//a[@data-autotest-id='mr-link-without-sso-1']"))
    public WebElement singInWithOUTSSOButton;
}
