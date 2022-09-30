Feature: Generate Token
  As a user
  I want to generate token my account
  So I can manage token my account

  Scenario: Generate token with valid username and valid password
    Given I set valid username and valid password
    When I request generate token
    Then I will get 200
    And get Success message

  Scenario: Generate token with null username and valid password
    Given I set null username and valid password
    When I request generate token
    Then I will get 400
    And get Bad Request message

  Scenario: Generate token with null username and invalid password
    Given I set null username and invalid password
    When I request generate token
    Then I will get 400
    And get Bad Request message

  Scenario: Generate token with valid username and null password
    Given I set valid username and null password
    When I request generate token
    Then I will get 400
    And get Bad Request message

  Scenario: Generate token with invalid username and null password
    Given I set invalid username and null password
    When I request generate token
    Then I will get 400
    And get Bad Request message

  Scenario: Generate token with invalid username and invalid password
    Given I set invalid username and invalid password
    When I request generate token
    Then I will get 400
    And get Bad Request message

  Scenario: Generate token with invalid username and valid password
    Given I set invalid username and valid password
    When I request generate token
    Then I will get 400
    And get Success message

  Scenario: Generate token with valid username and invalid password
    Given I set invalid username and invalid password
    When I request generate token
    Then I will get 400
    And get Success message



