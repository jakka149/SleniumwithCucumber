Feature: Test the amazon search items

  Scenario: search the iphone keyword in amazon website
    Given open the browser
    And search with keyword
    When click on the search button
    Then validate the results
