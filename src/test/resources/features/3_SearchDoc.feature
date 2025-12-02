Feature: Search Documentation
  Background:
    Given the user access the web page

  @Test
    Scenario: Maven search
      When the user clicks on the search bar
      And writes "Maven" and click on the result
      Then visualize the title of the desired documentation
  @Test
    Scenario: Download documentation
    When the user clicks on the navbar option Downloads
    And visualize the selenium client
    Then clicks on other languages exist

