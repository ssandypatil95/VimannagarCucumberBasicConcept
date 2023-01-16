Feature: Order functionality

Background:
Given user should be logged into the application


Scenario: check previous order
When  user click on previous order
Then  user should see the previous order details

Scenario: check current order details
When  user click on order
Then  user should see the order details

Scenario: check cancelled order details
When  user click on cancelled order
Then  user should see the cancelled order details