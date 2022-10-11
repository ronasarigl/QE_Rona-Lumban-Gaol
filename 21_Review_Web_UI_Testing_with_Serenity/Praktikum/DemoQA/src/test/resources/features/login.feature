Feature: Login
  As a user
  I want to login
  So i can access the main page

  Scenario: Login with invalid username and invalid password
    Given I am on the login page
    When I input invalid username
    And I input invalid password
    And I click Login Button
    Then I will get error message

  Scenario: Login with invalid username and valid password
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And I click Login Button
    Then I will get error message

  Scenario: Login with valid username and invalid password
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And I click Login Button
    Then I will get error message

  Scenario: Login with valid username and valid password
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click Login Button
    Then I will go to dashboard

  Scenario: Login with valid username
    Given I am on the login page
    When I input valid username
    And I click Login Button
    Then I get warning error

  Scenario: Login with valid password
    Given I am on the login page
    When I input valid password
    And I click Login Button
    Then I get warning error

  Scenario: Login with invalid username
    Given I am on the login page
    When I input invalid username
    And I click Login Button
    Then I get warning error

  Scenario: Login with invalid password
    Given I am on the login page
    When I input invalid password
    And I click Login Button
    Then I get warning error

