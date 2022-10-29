Feature: Delete a product
  As a admin
  I want to delete a product
  So I can manage a product

  Scenario: Delete a product
    Given I set valid delete product url
    When I send request delete a product
    Then I get status code 200