package com.tryCloud.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactsStepDefinitions {

    @Given("the user is on the home page")
    public void givenUserIsOnHomePage() {
    }

    @When("the user clicks on the Contacts module")
    public void whenUserClicksOnContactsModule() {
    }

    @When("the user clicks on the Create New Group button")
    public void whenUserClicksCreateNewGroupButton() {
        // Implementation for clicking on the Create New Group button
    }

    @Then("the create a new group feature should appear")
    public void thenCreateNewGroupFeatureShouldAppear() {
        // Implementation for verifying the appearance of the new group feature
    }

    @Then("the user should be able to enter a name for the new group")
    public void thenUserCanEnterGroupName() {
        // Implementation for entering a name for the new group
    }

    @Then("the user should be able to click a Create or arrow button")
    public void thenUserCanClickCreateButton() {
        // Implementation for clicking the Create button
    }

    @Then("the new group should be created and listed in the Contacts Module")
    public void thenNewGroupIsListed() {
        // Implementation for verifying that the new group is created and listed
    }

    //----------------------------------------------------------------------------

    public WebDriver driver;

    @Given("user navigates to {string} module page")
    public void userNavigatesToModulePage(String moduleName) {
        // Initialize WebDriver and navigate to the specified module
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.trycloud.net/index.php/apps/contacts/");
    }

    @When("user clicks on {string}")
    public void userClicksOn(String elementText) {
        // Find and click the specified element on the page
        WebElement element = driver.findElement(By.linkText(elementText));
        element.click();
    }

    @Then("user should see {string} on contact’s info page")
    public void userShouldSeeOnContactInfoPage(String propertyText) {
        // Implement the verification logic to check if "Anniversary" is visible on the page
        WebElement propertyElement = driver.findElement(By.xpath("//div[contains(text(), '" + propertyText + "')]"));
        assert (propertyElement.isDisplayed());
    }
}












