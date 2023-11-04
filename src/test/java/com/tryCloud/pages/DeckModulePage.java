package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeckModulePage {

    public DeckModulePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@aria-label='Deck'][1]")
    public WebElement deckButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement boardName;

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//a[@aria-current='page']")
    public WebElement chooseBoardNameInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement boardNameArrow;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> listOfAllBoards;

    @FindBy(id = "stack-add")
    public WebElement addListButton;

    @FindBy(xpath = "//button[@class='icon-collapse']")
    public WebElement collapsedMenu;

    @FindBy(xpath = "//input[@id='new-stack-input-main'][1]")
    public WebElement listNameInput;

    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public WebElement newList;

    @FindBy(xpath = "(//button[@rel='noreferrer noopener'])[4]")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInput;

    @FindBy(xpath = "//div[@class='card current-card card__editable']")
    public WebElement cardNamePopUpLeft;
    @FindBy(xpath = "//div[@class='app-sidebar-tabs']")
    public WebElement cardNameSideBarRight;

    @FindBy(xpath = "//div[@class='card current-card card__editable']")
    public WebElement currentCard;
    @FindBy(xpath = "(//button[@aria-label='Actions'])[9]")
    public WebElement threeDots;
    @FindBy(xpath = "//span[text()='Assign to me']")
    public WebElement assignToMeButton;
    @FindBy(xpath = "//div[@class='avatardiv popovermenu-wrapper has-tooltip']")
    public WebElement userProfileIcon;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement threeDashesMenu;

    ////div[@style='width: 32px; height: 32px; line-height: 32px; font-size: 18px;']



}
