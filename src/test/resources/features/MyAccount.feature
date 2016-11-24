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
     |Personal Details  |Personal Details |
#     |Order History  |               |
#     |Email Address  |               |
#     |Personal Details  |               |
#     |Address Book  |               |
#     |Payment Details  |               |
#     |Password  |               |
#     |Sign Out  |  home page   |
#     |Personal Details  |               |


  Scenario: Verify that alert messages are shown if submit if required fields are not populated.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    And click on "Personal Details" option
    And empty DEA field and click on update
    Then validation messages for the required fields are shown
    And update the personal details
    Then "personal details" is updated
    And home page is opened if click on cancel button
    Then "home page" is opened

  Scenario: Verify that validation messages are shown in Password Update page.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    And click on "Address Book" option
    And click on "add address" button