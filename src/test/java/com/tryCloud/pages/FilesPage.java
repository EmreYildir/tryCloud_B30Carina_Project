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

}
