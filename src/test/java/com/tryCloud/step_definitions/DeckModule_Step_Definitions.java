package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckModulePage;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeckModule_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    DeckModulePage deckModulePage = new DeckModulePage();


   /* @Given("user enters login and password")
    public void user_enters_login_and_password() {
        loginPage.userName.sendKeys("User33");
        loginPage.password.sendKeys("Userpass123");
        loginPage.submit.click();
        }

    */


    @When("user clicks on Deck Module")
    public void user_clicks_on_deck_module() {
       deckModulePage.deckButton.click();


    }
    @And("then clicks on Add Board")
    public void thenClicksOnAddBoard() {
        deckModulePage.addBoardButton.click();
    }

    @And("writes a {string}")
    public void writesA(String newBoardName) {

        deckModulePage.boardNameInput.sendKeys(newBoardName);
        deckModulePage.boardNameArrow.click();
    }

    @Then("newly created board should be displayed under All Boards")
    public void newlyCreatedBoardShouldBeDisplayedUnderAllBoards() {
        deckModulePage.newNameBoard.isDisplayed();
    }


    @When("user chooses a board name")
    public void user_chooses_a_board_name() {


    }




    @When("clicks on Add List Button")
    public void clicks_on_add_list_button() {

    }
    @When("writes a new list name")
    public void writes_a_new_list_name() {

    }
    @When("hits enter on the keyboard")
    public void hits_enter_on_the_keyboard() {

    }
    @Then("new list should be displayed")
    public void new_list_should_be_displayed() {

    }



    @When("clicks Add card button")
    public void clicks_add_card_button() {


    }
    @And("enters a {string}")
    public void entersA(String arg0) {
    }


    @Then("new card should be displayed")
    public void new_card_should_be_displayed() {

    }

    @And("clicks on the three dots on the {string}")
    public void clicksOnTheThreeDotsOnThe(String arg0) {
    }


    @And("clicks on Assign to me button")
    public void clicks_on_assign_to_me_button() {

    }
    @Then("user profile icon should be displayed near the three dots icon")
    public void user_profile_icon_should_be_displayed_near_the_three_dots_icon() {

    }








}
