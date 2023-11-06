package com.tryCloud.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateNewGroupStepDefinition {
    public WebDriver driver;

    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.trycloud.net/index.php/apps/dashboard/");
    }

    @Given("the user should click on Contacts module")
    public void the_user_should_click_on_contacts_module() {
        WebElement contactsModule = driver.findElement(By.id("contacts"));
        contactsModule.click();
    }

    @When("the user opens the group's dropdown menu")
    public void the_user_opens_the_group_s_dropdown_menu() {
        WebElement groupDropdown = driver.findElement(By.id("newgroup"));
        groupDropdown.click();
    }
    @Then("the user should see a list of all available groups")
    public void the_user_should_see_a_list_of_all_available_groups() {
        WebElement groupList = driver.findElement(By.id("groupList"));
        Assert.assertTrue(groupList.isDisplayed());
    }
    @Then("the user should verify that group names are matching")
    public void the_user_should_verify_that_group_names_are_matching() {
        WebElement groupList = driver.findElement(By.id("groupList"));
        List<WebElement> groupItems = groupList.findElements(By.tagName("li"));
        List<String> actualGroupNames = new ArrayList<>();
        for (WebElement groupItem : groupItems) {
            actualGroupNames.add(groupItem.getText());
        }

        List<String> CinemaTheatreMusic = Arrays.asList("Group1", "Group2", "Group3");

        Assert.assertEquals(CinemaTheatreMusic, actualGroupNames);

        driver.quit();





}

}

