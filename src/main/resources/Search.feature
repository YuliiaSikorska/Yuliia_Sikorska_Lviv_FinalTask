Feature: Tests of search field
  As a user
  I want to test search field of site
  So that I want to be sure that site works according to requirements

  Scenario Outline: Check search product by id
    When User search for '<keyword>' via search field
    Then User checks that current url contains '<pdp>'

    Examples:
      | keyword   | pdp           |
      | 200216638 | prd/200216638 |

  Scenario Outline: Check search result
    When User search for '<keyword>' via search field
    Then User checks that all products name contains '<keyword>' on search result page

    Examples:
      | keyword |
      | 92      |