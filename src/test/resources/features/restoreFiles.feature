@restoreFiles
Feature: Restore Files Feature
  User story: Users should be able to see all deleted files
  and delete/restore them permanently under the Deleted Files tab.


  Scenario: User restores a file from the Deleted Files tab
    Given user is logged in
    When user clicks on the Files icon
    And then clicks on the Deleted Files tab
    And clicks restore on the file
    Then the file should be restored
    And should appear in the All Files section
