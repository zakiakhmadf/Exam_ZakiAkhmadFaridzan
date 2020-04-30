@Android
  Feature: Check Statistic

    @CheckStatistic
    Scenario: User check to-do statistic
      Given User is on to-do list page
      When User tap the Navigate button
      And User tap Statistics
      Then User see "Statistics" as menu bar title