package com.tryCloud.step_definitions;

import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FolderViewFunctionality_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    FilesPage filesPage = new FilesPage();

    @Given("user enters login and password")
    public void user_enters_login_and_password() {
        loginPage.userName.sendKeys("User5");
        loginPage.password.sendKeys("Userpass123");
        loginPage.submit.click();
    }

    @Then("user clicks on files icon")
    public void user_clicks_on_files_icon() {
        dashboardPage.filesButton.click();
    }

    @Then("user can change folder view order by Name by clicking on it")
    public void user_can_change_folder_view_order_by_name_by_clicking_on_it() {
        filesPage.filesIcon.click();
        BrowserUtils.sleep(2);
        filesPage.filesIcon.click();
        BrowserUtils.sleep(2);


        List<String> actualListOfNames = new ArrayList<>();
        for (WebElement each : filesPage.listOfNames) {
            actualListOfNames.add(each.getText());

        }
        System.out.println(actualListOfNames);
        Collections.sort(actualListOfNames);
        System.out.println(actualListOfNames);

    }



   @Then("user can change folder view order by Size by clicking on icon Size")
    public void userCanChangeFolderViewOrderBySizeByClickingOnIconSize() {
       filesPage.sizeIcon.click();
       BrowserUtils.sleep(2);
       filesPage.sizeIcon.click();
       BrowserUtils.sleep(2);
       filesPage.sizeIcon.click();
       BrowserUtils.sleep(2);
       filesPage.sizeIcon.click();
       BrowserUtils.sleep(2);
   //     List<String> actualListOfNamesSortedBySize = new ArrayList<>();
        List<String> sizesBeforeSort;
        List<String> sizesAfterSort;
//
//        for (WebElement each : filesPage.listOfNames) {
//            List<String> actualListOfNames = new ArrayList<>();
//            actualListOfNames.add(each.getAttribute("size"));
//            System.out.println(actualListOfNames);
//
//        }
        List<WebElement> items = filesPage.listOfNames;

        sizesBeforeSort = new ArrayList<>();
        sizesAfterSort = new ArrayList<>();

        for (WebElement each : items) {
            // Extract and store the sizes before sorting
            //sizesBeforeSort.add(Integer.parseInt(each.getAttribute("date-size"))); // Adjust according
            sizesBeforeSort.add(each.getAttribute("data-size"));

        }
       System.out.println("hello");
        // Store the sizes and check if they're sorted
        sizesAfterSort.addAll(sizesBeforeSort);
        Collections.sort(sizesAfterSort);


        // Assert that the sizes are sorted
          Assert.assertEquals(sizesAfterSort,sizesBeforeSort);
    }
}






