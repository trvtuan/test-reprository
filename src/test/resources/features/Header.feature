Feature: As a user, I should be able to go to pages using links and menus in the header.


  Scenario Outline: sel.01.0001 Verify that menus are opened on click.
    Given go to website
    When click on "<menu>"
    Then "<page>" is opened

    Examples:
    |menu       |page       |
    |Products   |Products   |
    |About TDSC |About TDSC |
    |Practice Management|Practice Management |

  Scenario: sel.01.0002 Verify that logo in the header is redirected to the Home page.
    Given go to website
    When click on "logo"
    Then "home page" is opened


  Scenario: sel.01.0003 Verify that profile menu is shown in the header after authorization.
      Given go to website
      When click on "Sign In"
      And sign in using "tuan.truong@zaelab.com" pass "123456"
      Then total saving is shown in the header



