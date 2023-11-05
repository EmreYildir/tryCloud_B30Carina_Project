package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.util.ArrayList;
import java.util.List;

public class ContactPage {


    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebDriver driver;

    @FindBy(css = "[data-id='contacts']")
    public WebElement contactsMenu;

    @FindBy(id = "groups")
    public WebElement groupsDropdown;

    @FindBy(css = "div#groups-menu > ul > li")
    public List<WebElement> groupListItems;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContactsMenu() {
        contactsMenu.click();

    }

    public void openGroupsDropdown() {
        groupsDropdown.click();
    }

    public List<String> getAvailableGroups() {
        List<String> groupNames = new ArrayList<>();
        for (WebElement groupListItem : groupListItems){
            groupNames.add(groupListItem.getText());
        }
        return groupNames;



    }













}
