Feature:  validation messages
          ablitity to reset password
          ability to sign in

  Scenario: sel.03.0001 Verify that "Sign In" page is opened if click on "Sign In" text link in the header.
    Given  go to website
    When click on "Sign In"
    And click on "Login"
    Then validation messages are shown in the page


  Scenario: sel.03.0002 Verify that message about successful forgot password sending is shown.
    Given go to website
    When click on "Sign In"
    And click on "forgot password"
    And click on X buton to close pop-up
    Then populate field with "test.tdsc@gmail.com"
    Then message that notify email has been sent to the user

  Scenario: sel.03.0003 Verify that Home page is opened if click on "Home" text link in breadcrumb.
    Given go to website
    When click on "Sign In"
    And click on breadcrumb "home"
    Then "home page" is opened