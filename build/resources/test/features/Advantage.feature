Feature: As a user I want to enter the Advantage page to make a purchase


  Scenario: Enter the Advange website and simulate a purchase

    Given  that the user opens the browser and searches the requested website
    When he enters and looks for the desired item, he selects it and takes it to the shopping cart
      | username | password |
      | Alvaro28 | 1Q2w3e   |
    Then verify that your product is in the shopping cart and with the corresponding value Thank you for buying with Advantage