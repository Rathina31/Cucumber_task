Feature: Add a Tariff Plan

  Scenario: Add a Tariff Plan
    Given User should be in telecom homepages
    And User click on Add Tariff Plan
    When User enter all the fields
    And User clicks on submit button
    Then User should be displayed Congratulation you add Tariff Plan
