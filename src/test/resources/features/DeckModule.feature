@B30G11-129
Feature: Default
	Background: User is already in the log in page
		Given the user is on the login page

	
	@B30G11-125
	Scenario: US4AC1 - User can create a new board

		    When user clicks on Deck Module
		    And then clicks on Add Board
		    And writes a "new name"
		    Then newly created board should be displayed under All Boards

	
	@B30G11-126
	Scenario: US4AC2 - User can create a new list of card/task under any board

		      When user clicks on Deck Module
		      And user chooses a board name
		      And clicks on Add List Button
		      And writes a "new list name"
		      And hits enter on the keyboard
		      Then new list should be displayed	

	
	@B30G11-127
	Scenario: US4AC3 - User can add a new card/task on any list on the current board

		        When user clicks on Deck Module
		        And user chooses a board name
		        And clicks Add card button
		        And enters a "new Card name"
		        Then new card should be displayed	

	
	@B30G11-128
	Scenario: US4AC4 - User can assign any card/task to himself/herself by using the three dots on the related card

		        When user clicks on Deck Module
		        And user chooses a board name
		        And clicks on the three dots on the "new Card"
		        And clicks on Assign to me button
		        Then user profile icon should be displayed near the three dots icon