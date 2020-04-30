@Android
Feature: Check To-Do

  @CheckToDoMakeCoffee
  Scenario: User check to-do Make Coffee that has been created to be completed
    Given User is on to-do list page
    And User tap the add to-do button
    And User input "Make Coffee" as to-do title
    And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
    And User tap the save to-do button
    When User tap checkbox to complete to-do
    Then User see the checkbox is checked

  @CheckToDoMakeSteak
  Scenario: User check to-do Make Steak that has been created to be completed
    Given User is on to-do list page
    And User tap the add to-do button
    And User input "Make Steak" as to-do title
    And User input "Medium rear 250gr Wagyu Beef Steak" as to-do description
    And User tap the save to-do button
    When User tap checkbox to complete to-do
    Then User see the checkbox is checked

  @CheckToDoWatchNetflix
  Scenario: User check to-do Make Steak that has been created to be completed
    Given User is on to-do list page
    And User tap the add to-do button
    And User input "Watch Netflix" as to-do title
    And User input "Brooklyn Nine-Nine season 1 episode 8" as to-do description
    And User tap the save to-do button
    When User tap checkbox to complete to-do
    Then User see the checkbox is checked