Feature: Add a customer with valid data

  Scenario: Add a customer with valid data
   Given User should be in telecom homepage
   And User click on add customer button
   When User enters all the fields
   And User click on submit button
   Then User should be displayed the customer id is generated
  
    Scenario: Add a customer with valid data
  Given User should be in telecom homepage
  And User click on add customer button
  When Users enters all the fields
    | Vijar | Kumar | Vijaykumar@gmail.com | Chennai | 1234567891 |
  And User click on submit button
  Then User should be displayed the customer id is generated
  
  Scenario: Add a customer with valid data
    Given User should be in telecom homepage
    And User click on add customer button
    When Users enters all the field
      | fname   | Ashok                 |
      | lname   | Vijay                 |
      | email   | ashok.vijay@gmail.com |
      | address | coimbatore            |
      | phno    |            0123456789 |
    And User click on submit button
    Then User should be displayed the customer id is generated

  Scenario Outline: 
    Given User should be in telecom homepage
    And User click on add customer button
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
    And User click on submit button
    Then User should be displayed the customer id is generated

    Examples: 
      | fname    | lname | email           | address | phno        |
      | java     | rajan | ramav@gmail.com | chennai | 12344556667 |
      | selenium | rajan | ramav@gmail.com | chennai | 12344556667 |
      | cucumber | rajan | ramav@gmail.com | chennai | 12344556667 |
      | testng   | rajan | ramav@gmail.com | chennai | 12344556667 |
      | junit    | rajan | ramav@gmail.com | chennai | 12344556667 |
