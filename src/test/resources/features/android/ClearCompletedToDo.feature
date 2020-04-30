@Android
  Feature: Clear Completed To-Do

    @ClearCompleted
    Scenario: User clear completed Make Coffee to-do
      Given User is on to-do list page
      And User tap the add to-do button
      And User input "Make Coffee" as to-do title
      And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
      And User tap the save to-do button
      And User tap checkbox to complete to-do
      When User tap options button
      And User tap Clear completed
      Then User see "You have no TO-DOs!" on to-do list page