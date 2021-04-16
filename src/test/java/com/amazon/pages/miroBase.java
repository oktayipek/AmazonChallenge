package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class miroBase {
    public miroBase() { PageFactory.initElements(Driver.get(), this); }

}
