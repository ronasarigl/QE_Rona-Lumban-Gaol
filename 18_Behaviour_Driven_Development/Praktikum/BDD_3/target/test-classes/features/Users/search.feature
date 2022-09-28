Feature: Search
  As a user
  I want to search a job
  So I can search a job

  Scenario: null keyword
    Given I go to main page
    When I enter null keyword
    Then I will get last history in search box
    And I can see last history

  Scenario: invalid keyword
    Given I go to main page
    When I enter invalid keyword
    Then I will get suitable job

  Scenario: valid keyword
    Given I go to main page
    When I enter valid keyword in search box
    Then I will get suitable job

