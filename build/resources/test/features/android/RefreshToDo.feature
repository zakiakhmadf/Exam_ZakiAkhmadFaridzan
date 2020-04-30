@Android
  Feature: Refresh

    @Refresh
    Scenario: User refresh to-do list page with no task
      Given User is on to-do list page
      When User tap options button
      And User tap Refresh
      Then User see "You have no TO-DOs!" on to-do list page
