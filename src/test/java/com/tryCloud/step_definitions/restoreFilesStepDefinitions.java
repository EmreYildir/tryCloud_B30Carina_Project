package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class restoreFilesStepDefinitions {


    @Given("user is logged in")
    public void user_is_logged_in() {
        //logs user into page with valid credentials
       Driver.getDriver().get("https://qa.trycloud.net");
    LoginPage loginPage = new LoginPage();
        loginPage.login("User1", "Userpass123");

    }
    @When("user clicks on the Files icon")
    public void user_clicks_on_the_files_icon() {
        //clicks on file icon
        FilesPage filesPage = new FilesPage();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.filesIcon);
        filesPage.filesIcon.click();

    }
    @When("then clicks on the Deleted Files tab")
    public void then_clicks_on_the_deleted_files_tab() {
        FilesPage filesPage = new FilesPage();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.trashIcon);
        filesPage.trashIcon.click();

    }
    @When("clicks restore on the file")
    public void clicks_restore_on_the_file() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the file should be restored")
    public void the_file_should_be_restored() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("should appear in the All Files section")
    public void should_appear_in_the_all_files_section() {
        // Write code here that turns the phrase above into concrete actions

    }
}
