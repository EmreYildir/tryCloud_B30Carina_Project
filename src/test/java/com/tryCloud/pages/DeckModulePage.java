package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage {

    public DeckModulePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-label='Deck'][1]")
    public WebElement deckButton;

    @FindBy(xpath = "//a[@class='F']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement boardNameArrow;

    @FindBy(xpath = "//span[@title='new name']")
    public WebElement newNameBoard;

    @FindBy()
    public WebElement d;

    @FindBy()
    public WebElement e;

    @FindBy()
    public WebElement f;
}
