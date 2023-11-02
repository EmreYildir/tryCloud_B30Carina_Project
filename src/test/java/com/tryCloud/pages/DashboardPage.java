package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li/a[@aria-label='Files'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameHeader;

    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;

    @FindBy(xpath = "//li[@data-v-d8d86ca2]")
    public WebElement widgetBoxes;





}
