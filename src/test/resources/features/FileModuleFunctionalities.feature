@B30G11-141
Feature: As a user, I should be able to upload a file, move or delete any selected file under the Files module

	Background: User logged in and on files page

	@B30G11-137
	Scenario: US02AC01 As a user, I should be able to upload a file

		When user click on plus sign
		Then user should see dropdown menu
		When user click on upload file from dropdown menu

		Then click upload button
		And user should see downloaded file in a files list	

	
	@B30G11-138
	Scenario: US02AC02User can create new folder

		
		When user click on plus sign
		Then user should see pop-up window
		When user click New folder
		Then input box should open 
		When user provide New folder name
		And user click arrow sign
		Then user should see new folder in a files list	

	
	@B30G11-139
	Scenario: US02AC03User can delete any selected item from its three dots menu

		
		When user hover over any file and click tree dots menu 
		And  user click Delete folder in dropdown menu
		Then folder is deleted from the files list

	
	@B30G11-140
	Scenario: US02AC04User can see the total number of files and folders under the files list table

		When user scroll down the files list 
		Then user should see total number of the folders and files