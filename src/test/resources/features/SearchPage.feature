Feature: As a user,
          I should be able to search products
          Use search facets
          changing search pages using paginations.


  Scenario: sel.06.0001 Verify that "Search" page is opened if user search terms which generated no results.
      Given go to website
      When click on magnifying glass
      Then empty search result page is opened

  Scenario: sel.06.0002 Verify that "Search" page is opened with search results.
      Given go to website
      When search for ""
      And click on magnifying glass
      Then search page with results is opened.


