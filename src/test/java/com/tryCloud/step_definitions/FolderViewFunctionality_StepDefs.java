package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;

import java.sql.ClientInfoStatus;
import java.text.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FolderViewFunctionality_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    @Given("user enters login and password")
    public void user_enters_login_and_password() {
        loginPage.login("User5", "Userpass123");
    }

    @Then("user clicks on files icon")
    public void user_clicks_on_files_icon() {
        dashboardPage.filesButton.click();
    }

    @Then("user can change folder view order by Name by clicking on it")
    public void user_can_change_folder_view_order_by_name_by_clicking_on_it() {
        filesPage.nameIcon.click();
        List<String> actualListOfNames = new ArrayList<>();
        List<String> expectedListOfNames = new ArrayList<>();
        for (WebElement each : filesPage.listOfFoldersAndFiles) {
            actualListOfNames.add(each.getAttribute("data-file"));
            expectedListOfNames.add((each.getAttribute("data-file")));
        }
        Collections.sort(expectedListOfNames);
        Assert.assertEquals(expectedListOfNames, actualListOfNames);
    }

    @Then("user can change folder view order by Size by clicking on icon Size")
    public void userCanChangeFolderViewOrderBySizeByClickingOnIconSize() {
        BrowserUtils.sleep(1);
        filesPage.sizeIcon.click();
        List<String> sizesBeforeSort = new ArrayList<>();
        List<String> sizesAfterSort = new ArrayList<>();

        List<WebElement> items = filesPage.listOfFoldersAndFiles;
        for (WebElement each : items) {
            sizesBeforeSort.add(each.getAttribute("data-size"));
            sizesAfterSort.add(each.getAttribute("data-size"));
        }

        Collections.sort(sizesAfterSort);
        Collections.reverse(sizesAfterSort);

        Assert.assertEquals(sizesAfterSort, sizesBeforeSort);
    }

    @Then("user can change folder view order by Modified by clicking on icon Modified")
    public void userCanChangeFolderViewOrderByModifiedByClickingOnIconModified() {
        BrowserUtils.sleep(2);
        filesPage.modifiedIcon.click();

        List<String> modifiedBeforeSort = new ArrayList<>();
        List<String> modifiedAfterSort = new ArrayList<>();
        for (WebElement each : filesPage.listOfFoldersAndFilesWithDate) {
            modifiedBeforeSort.add(each.getAttribute("data-original-title"));
            modifiedAfterSort.add(each.getAttribute("data-original-title"));
        }

        Collections.sort(modifiedAfterSort);
        Comparator<String> dateComparator = new Comparator<String>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

            @Override
            public int compare(String dateString1, String dateString2) {
                try {
                    Date date1 = dateFormat.parse(dateString1);
                    Date date2 = dateFormat.parse(dateString2);
                    return date1.compareTo(date2);
                } catch (ParseException e) {
                    e.printStackTrace(); // Handle parsing errors
                }
                return 0; // Default to no change in order if there is an error
            }
        };
        Collections.sort(modifiedAfterSort, dateComparator);
        Collections.reverse(modifiedAfterSort);
        Assert.assertEquals(modifiedAfterSort, modifiedBeforeSort);
    }

    @When("User can select all the files by clicking select all")
    public void userCanSelectAllTheFilesByClickingSelectAll() {
        BrowserUtils.sleep(1);
        filesPage.buttonSelectAllFiles.click();
        for (WebElement each : filesPage.listOfCheckBoxes) {
            Assert.assertTrue("It's not selected", each.isSelected());
        }
    }
}






