package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li/a[@aria-label='Files'])[1]")
    public WebElement filesButton;

    @FindBy(xpath = "//ul[@id='appmenu']/li//a")
    public List<WebElement> dashBarModulesList = new ArrayList<>();

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement avatar;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement usernameHeader;

    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;

    @FindBy(xpath = "//li[@data-v-d8d86ca2]")
    public List<WebElement> widgetBoxes;

    @FindBy(xpath = "//ul[@class='statuses']//div[starts-with(@id, 'status-')]")
    public List<WebElement> getWidgetHeaderList1 = new ArrayList<>();

    @FindBy(xpath = "//div[@class='panel--header']")
    public List<WebElement> widgetHeaderList2 = new ArrayList<>();

    @FindBy(xpath = "(//button)[1]")
    public WebElement setStatusButton;

    @FindBy(xpath = "//div[@class='user-status-online-select']")
    public List<WebElement> statusList = new ArrayList<>();

    @FindBy(xpath = "//button[@class='status-buttons__primary primary']")
    public WebElement setStatusMessageButton;





}
