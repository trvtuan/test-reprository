Feature: As a user , I should be able to change my personal details
          updating password
          tracking orders


  Scenario: sel.08.0001 Verify that My Account pop-up is opened upon hover the text link.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    Then my account pop-up is opened with options

  Scenario Outline: sel.08.0002 Verify that Personal Details page is opened.
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


  Scenario: sel.08.0003 Verify that alert messages are shown if submit if required fields are not populated.
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

  Scenario: sel.08.0004 Verify that user is able to add a new address into Address Book.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    And click on "Address Book" option
    And click on "add address" button
    And click on "save" button
    Then validation messages are shown for address book
    And add new address
    Then new address is added into address book

  Scenario: sel.08.0005 Verify that user is able for editing and removing addresses.
    Given go to website
    When click on "Sign In"
    And sign in using "tuan.truong@zaelab.com" pass "123456"
    And hover to my account text link
    And click on "Address Book" option
    And click on "edit" button
#    And make some changes and save
#    Then address is updated



