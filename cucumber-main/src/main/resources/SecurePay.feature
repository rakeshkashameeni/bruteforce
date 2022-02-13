Feature: Secure Pay

  @smoke
  Scenario: Secure Pay
    Given I am on Google Home page
    When I search for SecurePay
    And I click through to the SecurePay website
    Then I navigate to Pricing and Standard pricing
    Then I verify that the pricing page is loaded
    When I click on Learn More button under Poli
    Then I verify that Poli site is opened and loaded in the new window
    When I navigate to Sell and Make a sales enquiry on the POLi site
    And I fill contact us form using random data

