Feature: Login

  Scenario: Login Error Message
    Given User Launch Chrome browser
    When User opens url "https://login.salesforce.com"
    And User enters Email as "maria@aspire.com" and Password as clear " "
    And Click on Login
    Then Error Message should be displayed
    And Close the browser

  Scenario: Valid Login Data Driven
    Given User Launch Chrome browser
    When User opens url "https://login.salesforce.com"
    And User enters Email as "maria@aspire.com" and Password as clear "Jeffery28"
    And Click on Login
    And Close the browser

  Scenario: Remember button check
    Given User Launch Chrome browser
    When User opens url "https://login.salesforce.com"
    And User enters Email as "maria@aspire.com" and Password as clear "Jeffery28"
    And click on remamber button
    And Click on Login
    And Click on UserMenu
    And Log out
    And Click on Login
    And Close the browser
