package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class FileModule_StepDef {

  LoginPage loginPage = new LoginPage();
  FilesPage filesPage = new FilesPage();
  DashboardPage dashboardPage = new DashboardPage();

  //AC1
    @When("user click on plus sign")
    public void userClickOnPlusSign() {
      loginPage.login("User20","Userpass123");
      dashboardPage.filesButton.click();
      filesPage.plusBtn.click();
    }

    @Then("user should see dropdown menu")
    public void userShouldSeeDropdownMenu() {

      filesPage.dropDown.isDisplayed();
    }

    @When("user click on upload file from dropdown menu")
    public void userClickOnUploadFileFromDropdownMenu() {
      filesPage.uploadFileBtn.sendKeys("/Users/yekaterinaudalov/Desktop/Screenshot 2023-10-11 at 1.10.28 PM.png" + Keys.ENTER);
      //filesPage.uploadFileBtn.click();
    }



    @Then("click upload button")
    public void clickUploadButton() {
    }

    @And("user should see downloaded file in a files list")
    public void userShouldSeeDownloadedFileInAFilesList() {

    }


    // AC2

    @Then("user should see pop-up window")
    public void userShouldSeePopUpWindow() {
    }

    @When("user click New folder")
    public void userClickNewFolder() {
    }

    @Then("input box should open")
    public void inputBoxShouldOpen() {
    }

    @When("user provide New folder name")
    public void userProvideNewFolderName() {
    }

    @And("user click arrow sign")
    public void userClickArrowSign() {
    }

    @Then("user should see new folder in a files list")
    public void userShouldSeeNewFolderInAFilesList() {
    }


    //AC3
    @When("user hover over any file and click tree dots menu")
    public void userHoverOverAnyFileAndClickTreeDotsMenu() {
    }

    @And("user click Delete file/folder in dropdown menu")
    public void userClickDeleteFileFolderInDropdownMenu() {
    }

    @Then("file/folder is deleted from the files list")
    public void fileFolderIsDeletedFromTheFilesList() {
    }

    //AC4

    @When("user scroll down the files list")
    public void userScrollDownTheFilesList() {
    }

    @Then("user should see total number of the folders and files")
    public void userShouldSeeTotalNumberOfTheFoldersAndFiles() {
    }


}
