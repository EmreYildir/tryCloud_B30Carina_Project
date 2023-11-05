@B30G11-145
Feature: Default


  @B30G11-142
  Scenario: AC_1- User should be able to create a new contact information by clicking the plus symbol next to New contact.
    Given user enters login
    When user will click the plus symbol next to new contact.
    Then user will create new contact by entering the information
    And user will click create
    Then The contact information will displayed


  @B30G11-143
  Scenario: AC-2 User should be able to edit the contact information by renaming the contact information.
    Given user enters login
    Then user click on the Settings to the left hand side of the display page
    Then user will click on the three symbols next to contact
    And user will click on rename
    Then user will click on the contact they will like to edit
    And user will see the contact information edit on the display


  @B30G11-144
  Scenario: AC-3 User should be able to delete the contact information by clicking the delete symbol
    Given user enters login
    Then user will click on the contact name they would like to delete
    Then user will click on the three symbols next to contact name
    And user will click the image trash with the word delete
    Then user will see the contact information delete on the displayed