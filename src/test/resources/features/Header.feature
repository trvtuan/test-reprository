Feature: As a user, I should be able to go to pages using links and menus in the header.


  Scenario Outline: Verify that Home page is opened if click on TDSC logo in the header.
    Given go to website
    When click on <menu>
    Then <page> is opened

    Examples:
    |menu       |page          |
    |powergrill |powergrill   |
    |anglegrinder|anglegrinder |



