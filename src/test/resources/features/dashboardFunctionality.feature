@wip_emre
Feature: US-001 Dashboard Functionality
  US : As a user I should be able to modify Dashboard page
  AC: 1 - After Login user can see all modules and Username.
      2 - User can click on Customize button and select any of the Widgets.
      3 - User can click on Set Status button and select any of the Status options.


  Scenario: After Login user can see all modules and Username
    Given user login with correct "username" and "password"
    Then user can see all modules below list
    |Dashboard|
    |Files|
    |Photos|
    |Activity|
    |Talk|
    |Mail|
    |Contacts|
    |Circles|
    |Calendar|
    |Deck|
    And user can see username


  Scenario: User can click on Customize button and select any of the Widgets
    Given user login with correct "username" and "password"
    When user clicks on Customize button
    Then user can select any of the Widgets


  Scenario: User can click on Set Status button and select any of the Status options
    Given user login with correct "username" and "password"
    When user clicks on Status button
    Then user can select any status options



