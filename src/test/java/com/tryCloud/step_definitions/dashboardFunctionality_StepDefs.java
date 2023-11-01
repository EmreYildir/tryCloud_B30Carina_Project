package com.tryCloud.step_definitions;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class dashboardFunctionality_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user login with correct {string} and {string}")
    public void user_login_with_correct_and(String string, String string2) {
        loginPage.login("User33","Userpass123");
    }

    @Then("user can see all modules below list")
    public void user_can_see_all_modules_below_list(List<String> expectedDashModules) {
        List<WebElement> actualDashModules = Driver.getDriver().findElements(By.xpath("//ul[@id='appmenu']/li//a"));
        List<String> actualDashModuleslist = new ArrayList<>();
        for (int i = 0; i < actualDashModules.size()-1; i++) {
            actualDashModuleslist.add(actualDashModules.get(i).getAttribute("aria-label"));
        }
        Assert.assertEquals(expectedDashModules,actualDashModuleslist);
    }

    @And("user can see username")
    public void userCanSeeUsername() {
        dashboardPage.usernameHeader.isDisplayed();
    }

    @When("user clicks on Customize button")
    public void user_clicks_on_customize_button() {
        dashboardPage.customizeButton.click();
    }

    @Then("user can select any of the Widgets")
    public void user_can_select_any_of_the_widgets() {
        List<WebElement> checkboxlist = Driver.getDriver().findElements(By.xpath("//li[@data-v-d8d86ca2]"));
        for (WebElement each : checkboxlist) {
            each.isSelected();
            each.click();
            }
        }

    @When("user clicks on Status button")
    public void user_clicks_on_status_button() {
        dashboardPage.statusButton.click();
    }

    @Then("user can select any status options")
    public void user_can_select_any_status_options() {
        /*
        Need to work on logic here.
        dashboardPage.statusButton.click();
        List<WebElement> statusOption = Driver.getDriver().findElements(By.xpath("//label[@data-v-d5c541dc]"));
//        List<String> statusOptionText = new ArrayList<>();
//        List<String> actualStatusText = new ArrayList<>();
//
//        for (WebElement element : statusOption) {
//            statusOptionText.add(element.getText());
//        }


        Actions actions = new Actions(Driver.getDriver());


        for (WebElement each : statusOption) {


            BrowserUtils.sleep(2);
            actions.moveToElement(each).click().perform();
            BrowserUtils.sleep(2);
            actions.moveToElement(dashboardPage.setStatusBtn).click().perform();
            BrowserUtils.sleep(2);


        */
        }

}
