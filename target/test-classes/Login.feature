@test
Feature: Login scenarios

  Scenario Outline: Login with valid user name
  When I'm on the login page "<username>"
    Examples:
      | username |
    | validUsername |



