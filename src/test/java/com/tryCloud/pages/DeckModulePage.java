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

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoardButton;

    @FindBy(xpath = "//a[@aria-current='page']")
    public WebElement chooseBoardNameInput;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement boardNameArrow;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> listOfAllBoards;

    @FindBy(xpath = "(//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip'])[1]")
    public WebElement addListButton;

    @FindBy(xpath = "(//input[@placeholder='List name'])[1]")
    public WebElement listNameInput;

    @FindBy(xpath = "//h3[@class='stack__title has-tooltip']")
    public WebElement newList;

    @FindBy(xpath = "(//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip'])[1]")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInput;

    @FindBy(xpath = "//div[@class='card current-card card__editable']")
    public WebElement cardNamePopUpLeft;
    @FindBy(xpath = "//div[@class='app-sidebar-tabs']")
    public WebElement cardNameSideBarRight;
    @FindBy(xpath = "//button[@aria-controls='menu-uclpf']")
    public WebElement threeDots;
    @FindBy(xpath = "(//button[@class='action-button focusable'])[1]")
    public WebElement assignToMeButton;
    @FindBy(xpath = "(//img[@src='/index.php/avatar/User1/32?v=37'])[2]")
    public WebElement userProfileIcon;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement threeDashesMenu;



}
