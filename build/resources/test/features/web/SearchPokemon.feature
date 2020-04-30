@Web
Feature: Get Pokemon By ID

  @Pikachu
  Scenario: User search pokemon Pikachu
    Given User open google page
    When User input keyword "Pikachu Wikipedia Indonesia" on the search field
    And User click search button
    And User click the first search
    Then User see "pikachu" as the title on wikipedia article page
    And User see 25 as pokemon number on wikipedia article page

  @Charizard
  Scenario: User search pokemon Charizard
    Given User open google page
    When User input keyword "Charizard Wikipedia Indonesia" on the search field
    And User click search button
    And User click the first search
    Then User see "charizard" as the title on wikipedia article page
    And User see 006 as pokemon number on wikipedia article page

  @Bulbasaur
  Scenario: User search pokemon Pikachu
    Given User open google page
    When User input keyword "Bulbasaur Wikipedia Indonesia" on the search field
    And User click search button
    And User click the first search
    Then User see "bulbasaur" as the title on wikipedia article page
    And User see 001 as pokemon number on wikipedia article page

  @Mewtwo
  Scenario: User search pokemon Pikachu
    Given User open google page
    When User input keyword "Mewtwo Wikipedia Indonesia" on the search field
    And User click search button
    And User click the first search
    Then User see "mewtwo" as the title on wikipedia article page
    And User see 150 as pokemon number on wikipedia article page