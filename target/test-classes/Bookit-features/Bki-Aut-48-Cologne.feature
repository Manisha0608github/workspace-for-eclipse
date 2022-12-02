Feature: Bookit form Retailer Dashboard

Scenario: Cologne Selection in a Bookit form Retailer Dashboard

Given user is in landing page
When user enters valid username
And user enters valid  password
And clicks on Sign-in button
Then user select Bookit from dashboard
Then user click on booking tab
Then user click on Configuration 
Then user clicks on cologne selection
Then verify user can create new cologne selection
Then verify user can create cologne selection with existing name
Then verify user can inactive from cologne selection
Then verify user can active from cologne selection
Then verify user can delete a cologne selection
Then verify user can delete a cologne selection with appointment
