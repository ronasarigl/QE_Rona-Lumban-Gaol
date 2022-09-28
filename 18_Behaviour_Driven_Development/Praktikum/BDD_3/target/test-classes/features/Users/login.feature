Feature: Login
  As a user
  I want to login with my email and my password
  So I can access all of the feature

  Scenario: Login with null email and null password
    Given I go to login page
    When I click login button
    Then I will get error  message data is required
    And I can't login

  Scenario: Login with null email and invalid password
    Given I go to login page
    When I input invalid password
    And I click login button
    Then I will get error  message email is required


  Scenario: Login with null email and valid password
    Given I go to login page
    When I input valid password
    And I click login button
    Then I will get error  message email is required

  Scenario: Login with invalid email and null password
    Given I go to login page
    When I input invalid email
    And I click login button
    Then I will get error  message password is required

  Scenario: Login with valid email and null password
    Given I go to login page
    When I input valid email
    And I click login button
    Then I will get error  message password is required


