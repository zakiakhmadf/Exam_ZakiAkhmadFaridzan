@Android
  Feature: Filter by Active Only

    @ActiveOnly
    Scenario: User filter to-do by active only with one active to-do
      Given User is on to-do list page
      And User tap the add to-do button
      And User input "Make Coffee" as to-do title
      And User input "Japanese Ice 150 ml with eight ice cubes" as to-do description
      And User tap the save to-do button
      When User tap menu filter
      And User tap Active
      Then User see "Make Coffee" as the to-do title on to-do list page