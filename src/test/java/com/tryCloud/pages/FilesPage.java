package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesIcon;

    @FindBy(xpath = "//li[@data-id='trashbin']")
    public WebElement trashIcon;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement deletedIcon;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement threeDots; //no such element

    @FindBy(xpath = "//a[@class='action action-restore permanent']")
    public WebElement restoreButton;

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement allFilesTab; //no such element



    public void accessDeletedFilesTab(){
        FilesPage page = new FilesPage();
        page.filesIcon.click();
        page.trashIcon.click();
    }
}
