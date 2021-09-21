Feature: Tests of add product to save list
  As a user
  I want to test add product to save list
  So that I want to be sure that site works according to requirements

  Scenario Outline: Check add product to saved list
    Given User opens product detail page for product '<productId>'
    When User clicks Save button
    And User clicks Saved item icon in header
    Then Saved items contain product '<productId>'

    Examples:
      | productId |
      | 23500046  |

  Scenario Outline: Check that user is able to move saved product to bag
    Given User opens product detail page for product '<productId>'
    When User clicks Save button
    And User clicks Saved item icon in header
    And User select size option for first product on saved items page
    And User clicks Move to bag button for first product on saved items page
    And User open Bag page '<bagPage>'
    Then User checks that product bag contains product '<productId>'

    Examples:
      | bagPage                  | productId |
      | https://www.asos.com/bag | 23500046  |