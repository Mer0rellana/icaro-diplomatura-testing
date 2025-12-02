Feature: Product interactions
  Background:
    Given the user is logged in

  @Test
  Scenario: Add a product to wishlist
    When the user visualizes a chosen product
    And the user adds the product to the wishlist
    Then a wishlist notification should be displayed

  @Test
    Scenario: Add a product to the shopping cart
    When the user visualizes a chosen product
    And the user adds the product to the shopping cart
    Then the cart should display the added product
