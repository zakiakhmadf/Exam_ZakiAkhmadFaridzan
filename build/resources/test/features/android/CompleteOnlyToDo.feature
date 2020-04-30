@Android
  Feature: Filter by Completed Only

    @CompleteOnly
    Scenario: User filter to-do by completed only with one completed to-do
      Given User is on to-do list page
      And User tap the add to-do button
      And User input "Make Coffee" as to-do title
      And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
      And User tap the save to-do button
      And User tap checkbox to complete to-do
      When User tap menu filter
      And User tap Completed
      Then User see "Make Coffee" as the to-do title on to-do list page