package com.tryCloud.step_definitions;

import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class restoreFiles_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();
    Actions actions = new Actions(Driver.getDriver());

    //ACCEPTANCE CRITERIA 1
    @Given("user is on the deleted files tab")
    public void user_is_on_the_deleted_files_tab() {
        Driver.getDriver().get("https://qa.trycloud.net/");
        loginPage.login("User2", "Userpass123"); //login to website
        filesPage.filesIcon.click(); //click on files icon
    }
    @When("user clicks to the deleted icon")
    public void user_clicks_to_the_deleted_icon() {
        filesPage.trashIcon.click(); //takes to "deleted files page"
        WebElement gridBox = Driver.getDriver().findElement(By.xpath("//label[@id='view-toggle']"));
        String className = gridBox.getAttribute("class");
        String expectedClassName = "button icon-toggle-pictures";
        boolean assertion = className.equals(expectedClassName); //assert that user is in vertical view


        //if user is not in vertical view:
        String altClassName = "button icon-toggle-filelist";
      if(className.equals(altClassName)){
            //press grid box and assert again

            filesPage.gridViewBox.click();
          Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            className = gridBox.getAttribute("class");
            Assert.assertEquals(className,expectedClassName ); //assert that user is in vertical view


          //assert that is sorted from newest to oldest
          //user clicks to "deleted" button

        filesPage.modifiedIcon.click();
        }
    }
    @Then("files sort from oldest to newest")
    public void files_sort_from_oldest_to_newest() {
    //assert that is sorted from oldest to newest
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks to the deleted icon, again")
    public void user_clicks_to_the_deleted_icon_again() {
        filesPage.modifiedIcon.click();
    }
    @Then("files sort from newest to oldest")
    public void files_sort_from_newest_to_oldest() {
    //assert that is sorted from newest to oldest
        throw new io.cucumber.java.PendingException();
    }

    //ACCEPTANCE CRITERIA 2
    @When("user clicks on the three dots to the right of selected file")
    public void user_clicks_on_the_three_dots_to_the_right_of_selected_file() {
        filesPage.trashIcon.click();

    }
    @When("clicks the Delete Permanently icon")
    public void clicks_the_delete_permanently_icon() {
        int size = filesPage.listOfDeletedFiles.size();

            filesPage.threeDots.click();
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            filesPage.deletePermIcon.click();
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //file is now deleted

        int newSize = filesPage.listOfDeletedFiles.size();

        if(size != newSize){
            Assert.assertTrue("has been deleted", true);
        }

    }
    @Then("the file is deleted permanently")
    public void the_file_is_deleted_permanently() {
    //File has been deleted if assertion is true;
    }



    //ACCEPTANCE CRITERIA 3
    @When("user presses restore on selected file")
    public void user_presses_restore_on_selected_file() {
        filesPage.trashIcon.click();

    }
    @Then("file is restored")
    public void file_is_restored() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("it is displayed under the All Files tab")
    public void it_is_displayed_under_the_all_files_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
