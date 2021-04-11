Feature: Order T-Shirt and Update User details

  Scenario Outline: Order T-Shirt
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
    And User search for "T-shirt" from the home page
    Then User is on search result page
    When User selects "T-shirt" from homepage
    And User adds item to the cart from product detail page
    Then Verify "T-shirt" product on cart page
    When User proceeds to checkout from Cart page
    And User clicks on proceed to checkout button on Summary page
    Then Verify "Billing Address" address on Address confirmation page
    Then User clicks on proceed to checkout button on Address confirmation page
    Then Verify terms of service on Shipping page
    And  User click on agree button on Shipping page
    And  User click on proceed to checkout on Shipping page
    And  Verify product details on Payment page
    When select "Pay by check" as payment method on Payment page
    Then Verify selected payment method on payment page

  Examples:
    | emailId                | password    |
    | singh.marwah@gmail.com | password123 |

  @qTest
  Scenario Outline: Update First Name of the user in User details section
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
    When User click on My personal information
    Then Verify user on edit profile screen
    When User change the username then provide "<password>" and continue
    Then Verify success message

    Examples:
      | emailId | password |
      |  singh.marwah@gmail.com |   password123 |