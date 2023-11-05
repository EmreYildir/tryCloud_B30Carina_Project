package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {


    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}