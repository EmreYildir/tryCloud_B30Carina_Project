@restoreFiles
Feature: Restore Files Feature
  User story: Users should be able to see all deleted files
  and delete/restore them permanently under the Deleted Files tab.

@A1
Scenario: User can order the all deleted files by newest to oldest or vice versa
  Given user is on the deleted files tab
  When user clicks to the deleted icon
  Then files sort from oldest to newest
  When user clicks to the deleted icon, again
  Then files sort from newest to oldest

@A2
  Scenario: User can delete any deleted file permanently by using the three dots
  icon in the file’s line
    Given user is on the deleted files tab
    When user clicks on the three dots to the right of selected file
    And clicks the Delete Permanently icon
    Then the file is deleted permanently

@A3
  Scenario: User can restore any deleted file and see it again under the All Files tab
    Checklists
    Given user is on the deleted files tab
    When user presses restore on selected file
    Then file is restored
    And it is displayed under the All Files tab
