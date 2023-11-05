package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactInformation {
    LoginPage loginPage = new LoginPage();
    @Given("user will enter login and password")
    public void user_will_enter_login_and_password() {
        loginPage.userName.sendKeys("User8");
        loginPage.password.sendKeys("Userpass123");
        loginPage.submit.click();
    }
    @When("user will click the plus symbol next to new contact.")
    public void user_will_click_the_plus_symbol_next_to_new_contact() {


    }
    @Then("user will create new contact by entering the information")
    public void user_will_create_new_contact_by_entering_the_information() {

    }
    @Then("user will click create")
    public void user_will_click_create() {

    }
    @Then("The contact information will displayed")
    public void the_contact_information_will_displayed() {
        ;
    }

    @Then("user click on the Settings to the left hand side of the display page")
    public void user_click_on_the_settings_to_the_left_hand_side_of_the_display_page() {

    }
    @Then("user will click on the three symbols next to contact")
    public void user_will_click_on_the_three_symbols_next_to_contact() {
    }
    @Then("user will click on rename")
    public void user_will_click_on_rename() {
    }
    @Then("user will click on the contact they will like to edit")
    public void user_will_click_on_the_contact_they_will_like_to_edit() {

    }
    @Then("user will see the contact information edit on the display")
    public void user_will_see_the_contact_information_edit_on_the_display() {

    }

    @Then("user will click on the contact name they would like to delete")
    public void user_will_click_on_the_contact_name_they_would_like_to_delete() {

    }
    @Then("user will click on the three symbols next to contact name")
    public void user_will_click_on_the_three_symbols_next_to_contact_name() {

    }
    @Then("user will click the image trash with the word delete")
    public void user_will_click_the_image_trash_with_the_word_delete() {

    }
    @Then("user will see the contact information delete on the displayed")
    public void user_will_see_the_contact_information_delete_on_the_displayed() {

    }

    @Given("user enters login")
    public void userEntersLogin() {
    }
}
