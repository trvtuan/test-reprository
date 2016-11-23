Feature: As a user , I should be able to change my personal details
          updating password
          tracking orders


  Scenario: Verify that My Account pop-up is opened upon hover the text link.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    Then my account pop-up is opened with options

  Scenario Outline: Verify that Personal Details page is opened.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    And click on "<menu>" option
    Then "<page>" is opened

    Examples:
     |menu              |page           |
     |Personal Details  |               |
     |Order History  |               |
     |Email Address  |               |
     |Personal Details  |               |
     |Address Book  |               |
     |Payment Details  |               |
     |Password  |               |
     |Sign Out  |  home page   |
#     |Personal Details  |               |
