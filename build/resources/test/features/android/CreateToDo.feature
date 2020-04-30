@Android
Feature: Create To-Do

  @CreateToDo
  Scenario: Create Make Coffee to-do
    Given User is on to-do list page
    When User tap the add to-do button
    And User input "Make Coffee" as to-do title
    And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
    And User tap the save to-do button
    And User tap the to-do title
    Then User see "Make Coffee" as the to-do title
    And User see "Japanese Ice 150 ml with eight ice cubes" as the to-do description