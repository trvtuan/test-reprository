Feature: Ensure that all hyperlinks in the footer redirect to the corresponding pages.

  Scenario Outline: sel.02.0001 Verify that links are clickable and redirect to corresponding pages.
    Given go to website
    When click "<link>" "<arg>"
    Then "<page>" is opened with "<url>"

     Examples:
    |link               |arg | page         | url                           |
    |Logo               |0   | Home page    |                               |
    |About Us           |1   | About CDA    |                               |
    |Documentation      |2   |              |                               |
    |Contact Us         |3   |              |                               |
    |Careers            |4   |              |                               |
    |                   |5   |              |                               |