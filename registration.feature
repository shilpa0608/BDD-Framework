Feature: nopcommerce register
  Background:
    Given User able to open browser
    And Enter url
  Scenario: Register user details
    When User click on Register button
    When User enters  the first name and last name
    When User selects date of birth
    Then User enters the email address
    Then USER ENTERS PASSWORD and CONFIRM PASSWORD
    Then USER  CLICK ON REGISTER

