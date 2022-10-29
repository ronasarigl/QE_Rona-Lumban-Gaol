Feature: Delete cart
  As a user
  I want to delete the cart
  So I can manage my cart

  Scenario: delete a cart
    Given I set url delete a cart
    When I request delete a cart
    Then I get status code 200