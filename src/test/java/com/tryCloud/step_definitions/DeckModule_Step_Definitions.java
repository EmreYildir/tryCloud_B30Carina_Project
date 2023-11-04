package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckModulePage;
import com.tryCloud.pages.FilesPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DeckModule_Step_Definitions {
    LoginPage loginPage = new LoginPage();
    DeckModulePage deckModulePage = new DeckModulePage();
    @When("user clicks on Deck Module")
    public void user_clicks_on_deck_module() {


        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(deckModulePage.deckButton);
        deckModulePage.deckButton.click();


    }
    @And("then clicks on Add Board")
    public void thenClicksOnAddBoard() {
        deckModulePage.threeDashesMenu.click();
        BrowserUtils.sleep(3);
        deckModulePage.addBoardButton.click();
    }

    @And("writes a {string}")
    public void writesA(String newBoardName) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        deckModulePage.boardName.sendKeys(newBoardName);
        BrowserUtils.sleep(3);
        deckModulePage.boardNameArrow.click();


        deckModulePage.chooseBoardNameInput.isDisplayed();
    }

    @Then("newly created board should be displayed under All Boards")
    public void newlyCreatedBoardShouldBeDisplayedUnderAllBoards() {
        BrowserUtils.sleep(5);

    }


    @And("user chooses a board name")
    public void userChoosesABoardName() {
        deckModulePage.threeDashesMenu.click();


        List<String> actualListOfBoards = new ArrayList<>();
        for (WebElement each : deckModulePage.listOfAllBoards) {
            actualListOfBoards.add(each.getText());
            if (each.getText().equals("new name")){
                each.click();
                break;

            }


        }



    }

    @And("clicks on Add List Button")
    public void clicksOnAddListButton() {
        BrowserUtils.sleep(5);
        deckModulePage.addListButton.click();
    }

    @And("types a {string}")
    public void typesA(String listName) {
        deckModulePage.listNameInput.sendKeys(listName + Keys.ENTER);
    }

    @And("hits enter on the keyboard")
    public void hitsEnterOnTheKeyboard() {
      //  deckModulePage.listNameInput.sendKeys(Keys.ENTER);
    }

    @Then("new list should be displayed")
    public void newListShouldBeDisplayed() {
        deckModulePage.newList.isDisplayed();
    }

    @And("clicks Add card button")
    public void clicksAddCardButton() {
        deckModulePage.addCardButton.click();
    }

    @And("enters a {string}")
    public void entersA(String newCardName) {
        deckModulePage.cardNameInput.sendKeys(newCardName + Keys.ENTER);
    }

    @Then("new card should be displayed")
    public void newCardShouldBeDisplayed() {
        deckModulePage.cardNamePopUpLeft.isDisplayed();
        deckModulePage.cardNameSideBarRight.isDisplayed();
    }
    @And("clicks on the three dots on the current Card")
    public void clicksOnTheThreeDotsOnTheCurrentCard() {
        BrowserUtils.sleep(5);
        deckModulePage.currentCard.click();
        BrowserUtils.sleep(5);
        deckModulePage.threeDots.click();
    }


    @And("clicks on Assign to me button")
    public void clicksOnAssignToMeButton() {
        BrowserUtils.sleep(5);
        deckModulePage.assignToMeButton.click();
    }

    @Then("user profile icon should be displayed near the three dots icon")
    public void userProfileIconShouldBeDisplayedNearTheThreeDotsIcon() {
        BrowserUtils.sleep(5);
        deckModulePage.userProfileIcon.isDisplayed();
    }

    @Given("the user is logged in")
    public void theUserIsLoggedIn() {
        loginPage.userName.sendKeys("User10");
        loginPage.password.sendKeys("Userpass123");
        loginPage.submit.click();
    }


}
