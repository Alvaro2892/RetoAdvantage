Feature: I as a user want to create a user on the website to be able to buy items

  Scenario: Enter the website and create a user
    Given that a user wants to enter the web page and create a user
    When he enters and fills in all the data on the registration form
      | username | email             | password | first_name | last_name | phone      | country  | city    | address      | state   | postal_code |
      | Alvaro28 | alvaro28@reto.com | 1Q2w3e   | Alvaro     | Angulo    | 3008467777 | Colombia | Sahagun | Calle23 1j82 | Sahagun | 1q2w3e      |
    Then Verify that the user was created correctly DEMO