Feature: nopcommerce login
  Background:
    Given User able to Open browser
    Given Enter URL
    Scenario: User able to login
      When USER ENTERS USER NAME AND PASSWORD
            Then USER IS IN LOGIN HOMEPAGE