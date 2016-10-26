Feature: Ensure that all hyperlinks in the footer redirect to the corresponding pages.

  Scenario Outline: Verify that links are clickable and redirect to proper pages.
    Given go to website
    When click <link>
    Then <page> is opened with <url>

     Examples:
    |link         | page         | url                           |
    |About CDA    | About CDA    |  http://www.cda.org/about-cda  |

