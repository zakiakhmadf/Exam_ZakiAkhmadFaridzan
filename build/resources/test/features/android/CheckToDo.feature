@Android
Feature: Check To-Do

  @CheckToDo
  Scenario: User check to-do Make Coffee that has been created to be completed
    Given User is on to-do list page
    And User tap the add to-do button
    And User input "Make Coffee" as to-do title
    And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
    And User tap the save to-do button
    When User tap checkbox to complete to-do
    Then User see the checkbox is checked