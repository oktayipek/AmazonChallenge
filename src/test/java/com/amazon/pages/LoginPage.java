package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".a-button.a-spacing-top-base.a-button-base.glow-toaster-button.glow-toaster-button-dismiss")
    public WebElement submitButtonForAddress;

    @FindBy(id = "nav-link-accountList")
    public WebElement singInPage;

    @FindBy(id = "ap_email")
    public WebElement emailText;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordText;

    @FindBy (id = "signInSubmit")
    public WebElement singButton;

    public void GoToSingPage(){
        singInPage.click();
    }

    public void LogingAsUser(String email, String password){
        emailText.sendKeys(email);
        continueButton.click();
        passwordText.sendKeys(password);
        singButton.click();
    }


}
