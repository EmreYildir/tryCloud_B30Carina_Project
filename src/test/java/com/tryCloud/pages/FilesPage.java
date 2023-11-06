package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesIcon;

    @FindBy(xpath = "//li[@data-id='trashbin']")
    public WebElement trashIcon;
    @FindBy(xpath = "//tr[@data-type='dir']")
    public List<WebElement> listOfFoldersAndFiles;

    @FindBy(xpath = "//td[@class='date']/span")
    public List<WebElement> listOfFoldersAndFilesWithDate;

    @FindBy(xpath = "(//a[@data-sort='name'])[1]")
    public WebElement nameIcon;

    @FindBy(xpath = "(//table[@id='filestable']//th/a[@data-sort='size'])[1]")
    public WebElement sizeIcon;

    @FindBy(id = "modified")
    public WebElement modifiedIcon;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement buttonSelectAllFiles;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public List<WebElement> listOfCheckBoxes;

    @FindBy(id = "view-toggle")
    public WebElement gridViewBox;

    @FindBy(id = "fileList")
    public List<WebElement> listOfDeletedFiles;

    @FindBy(xpath = "//td[@class='filename']")
    public WebElement mostRecentFile;

    @FindBy(xpath = "(//td[@class='filename']//a[@class='action action-menu permanent'])[1]")
    public WebElement threeDots;

    @FindBy(xpath = "(//span[@class='icon icon-delete'])[4]")
    public WebElement deletePermIcon;

    @FindBy(xpath = "(//a[@class='action action-restore permanent'])[1]")
    public WebElement restoreIcon;

    @FindBy(xpath = "//a[@id='modified']/span[text()='Deleted']")
    public WebElement Deleted_Ordering;

    @FindBy(xpath = "//div[@id='app-content-trashbin']//tbody/tr")
    public List<WebElement> allDeletedFilesDate;

    @FindBy(xpath = "(//span[@class='sort-indicator icon-triangle-s']/..)[2]")
    public WebElement sortButton;

    @FindBy(xpath = "//tr[@data-id='2431']")
    public WebElement firstFile;
}
