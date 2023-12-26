package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.DashboardPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dashboardFunctionality_StepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user login with correct {string} and {string}")
    public void user_login_with_correct_username_and_password(String string, String string2) {
        loginPage.login("User33", "Userpass123");
    }

    @Then("user can see all modules below list")
    public void user_can_see_all_modules_below_list(List<String> expectedDashModules) {


        List<String> actualDashModuleslist = new ArrayList<>();
        for (int i = 0; i < dashboardPage.dashBarModulesList.size() - 1; i++) {
            actualDashModuleslist.add(dashboardPage.dashBarModulesList.get(i).getAttribute("aria-label"));
        }
        Assert.assertEquals(expectedDashModules, actualDashModuleslist);
    }

    //**************************************************************************************


    @Then("user can see username")
    public void userCanSeeUsername() {
        dashboardPage.avatar.click();
        Assert.assertTrue(dashboardPage.usernameHeader.isDisplayed());

    }


    //**************************************************************************************


    @When("user clicks on Customize button")
    public void user_clicks_on_customize_button() {
        dashboardPage.customizeButton.click();
    }

    @Then("user can select any of the Widgets")
    public void user_can_select_any_of_the_widgets(List<String> expectedWidget) {

        for (WebElement each : dashboardPage.widgetBoxes) {
            BrowserUtils.sleep(1);
            each.click();
        }

        List<String> actualWidget = new ArrayList<>();

        for (WebElement element : dashboardPage.getWidgetHeaderList1) {
            actualWidget.add(element.getText());
        }

        for (WebElement element : dashboardPage.widgetHeaderList2) {
            actualWidget.add(element.getText());
        }


        Assert.assertEquals(expectedWidget,actualWidget);




    }


    //**************************************************************************************


    @When("user clicks on Status button")
    public void user_clicks_on_status_button() {

        dashboardPage.setStatusButton.click();

    }

    @Then("user can select any status options")
    public void user_can_select_any_status_options() {

        for (int i = dashboardPage.statusList.size() - 1; i >= 0; i--) {
            dashboardPage.statusList.get(i).click();
            BrowserUtils.sleep(1);
            Assert.assertTrue(dashboardPage.statusList.get(i).getText().contains(dashboardPage.setStatusButton.getText()));

        }

        dashboardPage.setStatusMessageButton.click();
        dashboardPage.customizeButton.click();

        for (WebElement each : dashboardPage.widgetBoxes) {

            each.click();
            wait.until(ExpectedConditions.elementToBeClickable(each));
        }







    }

}