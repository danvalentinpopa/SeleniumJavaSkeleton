#Feature: User Registration and Login
#
#  Background:
#    Given I am on the Parabank homepage
#
#  Scenario: Register a new user
#    When I click on the "Register" link
#    And I fill in the registration form with valid information
#    And I submit the form
#    Then I should see a success message
#    And I should be able to log in with the newly registered user
#
#  Scenario: Log in with valid credentials
#    When I log in with valid credentials
#    Then I should be redirected to the accounts page
#
#  Scenario: Log in with invalid credentials
#    When I log in with invalid credentials
#    Then I should see an error message
#
#  Scenario: Log in with an unregistered username
#    When I log in with an unregistered username
#    Then I should see an error message
#
#  Scenario: Logout
#    When I log in with valid credentials
#    And I log out of my account
#    Then I should be redirected to the login page
