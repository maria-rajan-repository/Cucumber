Feature: Login

  Scenario: Login Error Message
    Given User Launch Chrome browser
    When User opens url "https://login.salesforce.com"
    And User enters Email as "maria@aspire.com" and Password as clear " "
    And Click on Login
    Then Error Message should be displayed