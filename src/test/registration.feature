Feature: Registration
  As a user
  I want to register
  So I can be a member

  Scenario: Becoming a member
    Given the website
    When I click on Sign in button
    And I click on Sign up link
    Then I fill out fields with information
    And I press submit button