Feature: Get user
  As a admin
  I want to get a user
  So I can manage my store

  Scenario: get all user
    Given I set url get all user
    When I send request get all user
    Then I get status code 200


  Scenario: get a single user
    Given I set url get a single user
    When I send request get a single user
    Then I get status code 200

