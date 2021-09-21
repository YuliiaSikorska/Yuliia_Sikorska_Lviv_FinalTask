Feature: User registration tests
  As a user
  I want to test registration option of site
  So that I want to be sure that site works according to requirements

  Scenario Outline: Check user registration
    Given User opens register page '<registerPage>'
    When User enters new random e-mail address on register page
    And User enters '<firstName>' into first name field on register page
    And User enters '<lastName>' into last name field on register page
    And User enters '<password>' into password field on register page
    And User selects valid date of birth on register page
    And User clicks Join asos button
    Then User checks that '<myAccountPage>' is opened on login page

    Examples:
      | registerPage                          | firstName | lastName | password     | myAccountPage |
      | https://my.asos.com/identity/register | Alison    | Prout    | Fgt7896+56fw | my-account    |

  Scenario Outline: Check user login
    Given User opens login '<loginPage>' page
    When User enters email '<emailAddress>' on sign in page
    And User enters password '<password>' on sign in page
    And User clicks Sign in button
    Then  User checks that '<myAccountPage>' is opened on login page

    Examples:
      | loginPage                          | emailAddress           | password   | myAccountPage |
      | https://my.asos.com/identity/login | AliseCroftin@gmail.com | 6DeFsj+P!7 | my-account    |

  Scenario Outline: Check correct error handling for existing user on registration page
    Given User opens register page '<registerPage>'
    When User enters '<e-mail>' into e-mail address field on register page
    And User enters first name '<firstName>' into first name field on register page
    And User enters last name '<lastName>' on register page
    And User enters password '<password>' on register page
    And User selects valid date of birth on register page
    And User clicks Join asos button
    Then Error message '<errorMessage>' is displayed under email address field

    Examples:
      | registerPage                          | e-mail                  | firstName | lastName | password      | errorMessage                                                     |
      | https://my.asos.com/identity/register | JuliaCnotiner@gmail.com | Julia     | Cnotiner | T9ldg*4t$i4_c | The email address has already been allocated to another customer |