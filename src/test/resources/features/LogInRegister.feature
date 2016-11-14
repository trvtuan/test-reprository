Feature:  validation messages
          ablitity to reset password
          ability to sign in

  Scenario: Verify that "Sign In" page is opened if click on "Sign In" text link in the header.
    Given  go to website
    When click on "Sign In"
    And click on "Login"
    Then validation messages are shown in the page


  Scenario: Verify that message about successful forgot password sending is shown.
    Given go to website
    When click on "Sign In"
    And click on "forgot password"
