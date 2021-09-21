Feature: Tests of main functionality
  As a user
  I want to test main functionality of site
  So that I want to be sure that site works according to requirements

  Scenario: Check site's main functions
    Given User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks My account icon visibility
    And User clicks My account icon in header
    And User checks that My account popup is visible
    And User checks Saved items icon visibility
    And User checks Bag icon visibility
    When User checks Preferences button visibility
    And User clicks Preferences button
    And User checks that Preferences popup is visible
    Then User checks that country dropdown is visible on Preferences popup
    Then User checks that currency dropdown is visible on Preferences popup