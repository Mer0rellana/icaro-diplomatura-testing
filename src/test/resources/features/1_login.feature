Feature: Login
  Background:

  @Test
  Scenario: Login with valid credentials
    Given Access the webpage and go to the login section
    When Enter my email "mer.p.orellana@gmail.com" and password "@BtvwNbWnVBx8d"
    And Press the login button
    Then Logout