@B30G11-136
Feature: Default


	@B30G11-133
	Scenario: US001-AC1 - Verify After Login user can see all modules and Username.
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


	@B30G11-150
	Scenario: US001-AC1 - Verify user can see username after login
		Given user login with correct "username" and "password"
		Then user can see username



	@B30G11-134
	Scenario: US001-AC2 - Verify User can click on Customize button and select any of the Widgets
		Given user login with correct "username" and "password"
		When user clicks on Customize button
		Then user can select any of the Widgets
			|Online|
			|Set location for weather|
			|Upcoming events|
			|Upcoming cards|
			|Important mail|
			|Unread mail|
			|Recommended files|
			|Talk mentions|
			|Recent statuses|


	@B30G11-135
	Scenario: US001-AC3 - Verify User can click on Set Status button and select any of the Status options
		Given user login with correct "username" and "password"
		When user clicks on Status button
		Then user can select any status options