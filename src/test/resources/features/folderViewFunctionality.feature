@B30G11-122
Feature: Default


  @B30G11-117
  Scenario: User can change folder view order by Name.
    Given user enters login and password
    Then user clicks on files icon
    Then user can change folder view order by Name by clicking on it


  @B30G11-118
  Scenario: User can change folder view order by Size
    Given user enters login and password
    Then user clicks on files icon
    Then user can change folder view order by Size by clicking on icon Size


  @B30G11-119
  Scenario: User can change folder view order by Modified button
    Given user enters login and password
    Then user clicks on files icon
    Then user can change folder view order by Modified by clicking on icon Modified

	#User can select all the files at once and see the total values of all
	#files in the first line when clicked on the “select all” checkbox at the left
	#top corner of the list.
  @B30G11-121
  Scenario: User can select all the files at once and see the total values of all
    Given user enters login and password
    Then user clicks on files icon
    When User can select all the files by clicking select all