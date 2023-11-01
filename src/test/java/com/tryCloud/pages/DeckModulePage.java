package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage {

    public DeckModulePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy()
    public WebElement k;

    @FindBy()
    public WebElement g;

    @FindBy()
    public WebElement a;

    @FindBy()
    public WebElement b;

    @FindBy()
    public WebElement c;

    @FindBy()
    public WebElement d;

    @FindBy()
    public WebElement e;

    @FindBy()
    public WebElement f;
}
