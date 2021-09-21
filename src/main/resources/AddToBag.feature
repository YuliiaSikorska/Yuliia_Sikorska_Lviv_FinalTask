Feature: Tests of add product to bag
  As a user
  I want to test of add product to bag
  So that I want to be sure that site works according to requirements

  Scenario Outline: Check empty bag
    When User click Bag icon in header
    Then User checks empty that bag title is '<emptyTitle>'

    Examples:
      | emptyTitle        |
      | Your bag is empty |

  Scenario Outline: Check add product to bag
    Given User opens product detail page for product '<productId>'
    And User selects available color-size option
    When User clicks Add to Bag button
    And User open Bag page '<bagPage>'
    Then User checks that product bag contains product '<productId>'

    Examples:
      | productId | bagPage                  |
      | 23500046  | https://www.asos.com/bag |