Feature: hmc

  Scenario: hybris authorization
    Given go to hybris hmc
    When log in with user "admin" pass "nimda"
