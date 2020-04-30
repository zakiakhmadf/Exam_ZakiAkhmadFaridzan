@Android
Feature: Create To-Do

  @CreateToDoMakeCoffee
  Scenario: Create Make Coffee to-do
    Given User is on to-do list page
    When User tap the add to-do button
    And User input "Make Coffee" as to-do title
    And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
    And User tap the save to-do button
    And User tap the to-do title
    Then User see "Make Coffee" as the to-do title
    And User see "Japanese Ice 150 ml with eight ice cubes" as the to-do description

  @CreateToDoMakeSteak
  Scenario: Create Make Steak to-do
    Given User is on to-do list page
    When User tap the add to-do button
    And User input "Make Steak" as to-do title
    And User input "Medium rear 250gr Wagyu Beef Steak" as to-do description
    And User tap the save to-do button
    And User tap the to-do title
    Then User see "Make Steak" as the to-do title
    And User see "Medium rear 250gr Wagyu Beef Steak" as the to-do description

  @CreateToDoWatchNetflix
  Scenario: Create Make Steak to-do
    Given User is on to-do list page
    When User tap the add to-do button
    And User input "Watch Netflix" as to-do title
    And User input "Brooklyn Nine-Nine season 1 episode 8" as to-do description
    And User tap the save to-do button
    And User tap the to-do title
    Then User see "Watch Netflix" as the to-do title
    And User see "Brooklyn Nine-Nine season 1 episode 8" as the to-do description