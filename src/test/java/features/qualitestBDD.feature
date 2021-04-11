Feature: Order T-Shirt and Update User details
@qTest
  Scenario: Order T-Shirt
    Given User is on Homepage of the application
    When User search for "T-Shirt" from the home page
    Then User is on search result page
    When User selects "T-Shirt" from homepage
    Then Verify selected product on the product detail page
    When User adds item to the cart from product detail page
    Then Verify "T-Shirt" product on cart page
    When User proceeds to checkout from Cart page
    Then User verifies product details on Summary page
    When User clicks on proceed to checkout button on Summary page
    Then Verify "Billing Address" address on Address confirmation page
    Then User clicks on proceed to checkout button on Address confirmation page
    Then Verify terms of service on Shipping page
    And  User click on agree button on Shipping page
    And  User click on proceed to checkout on Shipping page
    And  Verify product details on Payment page
    When select "Pay by check" as payment method on Payment page
    Then Verify selected payment method on payment page

  Scenario Outline: Update First Name of the user in User details section
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
    Then Verify successful login
    When User click on My personal information
    Then Verify user on edit profile screen
    When User change the username then provide "<password>" and continue
    Then Verify success message

    Examples:
      | emailId | password |
      |  singh.marwah@gmail.com |   password123 |