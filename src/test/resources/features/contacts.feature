@B30G11-131
Feature: Viewing Available Groups in Contact's Info

	
	@B30G11-132
	Scenario: Viewing Available Groups in Contact's Info
		Given the user is on home page
			And the user should click on Contacts module
		    When the user opens the group's dropdown menu
		    Then the user should see a list of all available groups
		    And the user should verify that group names are matching	

	
	@B30G11-130
	Scenario: Creating a New Group
		Scenario: Creating a New Group
		    Given the user is on home page
			And the user should click on Contacts module
		    And the user clicks on the Create New Group button
		    Then create a new group feature should appear
		    And the user should be able to enter a name for the new group
		    And the user should be able to click a Create or arrow button
		    And the new group should be created and listed in the Contacts Module

	@B30G11-151
	Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
		Given user navigates to "contacts" module page
		And user clicks on "Add new property"
		And choose "Anniversary"
		Then user should see "Anniversary" on contact’s info page