package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class miroLoginPage {
    public miroLoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "email")
    public WebElement miroWorkEmail;

    @FindBy(id = "password")
    public WebElement miroPassword;

    @FindBy(xpath = ("//button[@data-autotest-id='mr-form-login-btn-signin-1']"))
    public WebElement miroSignuInButton;

    @FindBy(xpath = "(//a[@data-autotest-id='mr-link-forgot-password-1'])")
    public WebElement miroForgetButton;

    @FindBy(xpath = "(//a[@data-autotest-id='mr-link-signin-with-sso-1'])")
    public WebElement singInWithSSOButton;

}
