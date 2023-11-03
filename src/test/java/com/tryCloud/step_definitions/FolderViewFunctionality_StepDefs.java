package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;

import java.text.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;


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
        BrowserUtils.sleep(2);
      filesPage.sizeIcon.click();
        BrowserUtils.sleep(2);

//        filesPage.sizeIcon.click();
//        BrowserUtils.sleep(2);
//        filesPage.sizeIcon.click();
//        BrowserUtils.sleep(2);

        List<String> sizesBeforeSort = new ArrayList<>();
        List<String> sizesAfterSort = new ArrayList<>();

//        for (WebElement each : filesPage.listOfFoldersAndFiles) {
//            List<String> actualListOfNames = new ArrayList<>();
//            actualListOfNames.add(each.getAttribute("size"));
//            System.out.println(actualListOfNames);
//        }
        List<WebElement> items = filesPage.listOfFoldersAndFiles;
        for (WebElement each : items) {
            sizesBeforeSort.add(each.getAttribute("data-size"));
            sizesAfterSort.add(each.getAttribute("data-size"));
        }
        System.out.println("by size");
        // Store the sizes and check if they're sorted
        //  sizesAfterSort.addAll(sizesBeforeSort);
        System.out.println(sizesAfterSort);
        System.out.println(sizesBeforeSort);
        Collections.sort(sizesAfterSort);


        // Assert that the sizes are sorted
        Assert.assertEquals(sizesAfterSort, sizesBeforeSort);
    }

    @Then("user can change folder view order by Modified by clicking on icon Modified")
    public void userCanChangeFolderViewOrderByModifiedByClickingOnIconModified() {
        BrowserUtils.sleep(2);
        filesPage.modifiedIcon.click();

        List<String> modifiedBeforeSort;
        List<String> modifiedAfterSort;
        modifiedBeforeSort = new ArrayList<>();
        modifiedAfterSort = new ArrayList<>();
        List<WebElement> items = filesPage.listOfFoldersAndFilesWithDate;
        for (WebElement each : items) {
            modifiedBeforeSort.add(each.getAttribute("data-original-title"));
            modifiedAfterSort.add(each.getAttribute("data-original-title"));

        }
        System.out.println("hello");

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
        Assert.assertEquals(modifiedAfterSort, modifiedBeforeSort);
        System.out.println(modifiedAfterSort);
        System.out.println(modifiedBeforeSort);


    }
}






