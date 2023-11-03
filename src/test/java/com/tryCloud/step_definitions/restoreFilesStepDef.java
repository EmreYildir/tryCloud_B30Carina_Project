package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class restoreFilesStepDef {
    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();

    @Given("user is on the deleted files tab")
    public void user_is_on_the_deleted_files_tab() {
        loginPage.login("User1", "Userpass123");
        filesPage.accessDeletedFilesTab();
    }

    //A1 (FIX @THEN)
    @When("user clicks to the deleted icon")
    public void user_clicks_to_the_deleted_icon() {
        filesPage.deletedIcon.click();
    }

    @Then("files sort from oldest to newest")
    public void files_sort_from_oldest_to_newest() {
        //TROUBLE ASSERTING THAT THEY HAVE BEEN SORTED
    }

    @When("user clicks to the deleted icon, again")
    public void user_clicks_to_the_deleted_icon_again() {
        // Write code here that turns the phrase above into concrete actions
        filesPage.deletedIcon.click();
    }
    @Then("files sort from newest to oldest")
    public void files_sort_from_newest_to_oldest(){

    }


    //A2 (FIX LOCATOR IN WHEN)
    @When("user clicks on the three dots to the right of selected file")
    public void user_clicks_on_the_three_dots_to_the_right_of_selected_file() {
        filesPage.threeDots.click();
        //ELEMENT NOT LOCATABLE
    }

    @When("clicks the Delete Permanently icon")
    public void clicks_the_delete_permanently_icon() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("the file is deleted permanently")
    public void the_file_is_deleted_permanently() {
        // Write code here that turns the phrase above into concrete actions

    }

    //A3 (CANNOT LOCATE ELEMENT IN @THEN)
    @When("user presses restore on selected file")
    public void user_presses_restore_on_selected_file() {
    filesPage.restoreButton.click();
    }

    @Then("file is restored")
    public void file_is_restored() {
    filesPage.allFilesTab.click();
    }

    @Then("it is displayed under the All Files tab")
    public void it_is_displayed_under_the_all_files_tab() {


    }
}
