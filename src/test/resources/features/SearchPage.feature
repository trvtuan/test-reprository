Feature: As a user,
          I should be able to search products

  Scenario: Verify that "Search" page is opened if user search terms which generated no results
    Given go to website
    When click on magnifying glass
    Then search page is opened

  Scenario: Check that Home page is opened if click on "Continue Shopping" button.
    Given go to website
    When click on magnifying glass
    When click on Continue Shopping
    Then home page is opened

  Scenario: Verify that "Search" page is opened with search results.
    Given go to website
    When populate search bar ""
    And click on magnifying glass
    Then  search page is opened
    Then  products with keyword "" are presented