Feature: Login
  As a user
  I want to logout
  So I can exit from the webpage

  Scenario: Logout with valid email and valid password
    Given I go to main page and I click profile button
    When I click sign out and don't click remember me
    Then I will out from the page
    And I can logout

  Scenario: Logout with valid email and valid password
    Given I go to main page and I click profile button
    When I click sign out and click remember me
    Then I will out from the page
    And I can logout