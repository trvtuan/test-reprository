Feature: As a user , I should be able to cahnge my personal details
          updating password
          tracking orders


  Scenario: Verify that My Account pop-up is opened upon hover the text link.
    Given go to website
    When click on "Sign In"
    And sign in using "alejandro.navarro@rustic-hw.com" pass "12341234"
    And hover to my account text link
    Then my account pop-up is opened with options

  Scenario: Verify that Personal Details page is opened.
    Given go to website
    When click on "Sign In"
    And sign in using "alejandro.navarro@rustic-hw.com" pass "12341234"
    And hover to my account text link
    And click on "Personal Details" option