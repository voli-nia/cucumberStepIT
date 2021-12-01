Feature: Login with valid credentials

  As a customer I want to be able to login into app with valid credentials

  @Login @Start
  Scenario Outline: Login to app
    Given the app login page is open
    When the user enters correct <username> and <password>
    Then the user is logged in

    Examples:
      |username       |password    |
      |standard_user  |secret_sauce|
      |problem_user   |secret_sauce|

  @Checkout @Stop
  Scenario Outline: Add product to cart
    Given the user is on product page
    When the user adds <product> to cart
    Then the cart counter is updated by 1

    Examples:
      |product            |
      |Sauce Labs Backpack|
