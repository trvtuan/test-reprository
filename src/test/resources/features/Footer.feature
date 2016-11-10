Feature: Ensure that all hyperlinks in the footer redirect to the corresponding pages.

  Scenario Outline: Verify that links are clickable and redirect to corresponding pages.
    Given go to website
    When click <link> <arg>
    Then <page> is opened with <url>

     Examples:
    |link        |arg | page         | url                           |
    |About CDA    |1| About CDA    |  http://www.cda.org/about-cda |

