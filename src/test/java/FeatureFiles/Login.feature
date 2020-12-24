Feature: Login Functionality


  @RegressionTest
  Scenario: Login with username and password


    Given Navigate to basqar

    When Enter username and password and  click Login button

    Then User should login successfully
