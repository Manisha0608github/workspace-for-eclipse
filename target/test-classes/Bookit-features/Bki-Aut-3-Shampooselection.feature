Feature: Bookit form Retailer Dashboard
@Bookit
Scenario: Shampoo Selection in a Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
And user enters valid  password
And clicks on Sign-in button
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Configuration 
Then user clicks on shampoo selection
Then verify user can create new shampoo
Then verify user can create shampoo with existing name
Then verify user can inactive from shampoo listing page
Then verify user can active from shampoo listing page
Then verify user can delete shampoo
Then verify user can delete a shampoo with appointment
