Feature: check product details

@smoke @functional
Scenario: get price of product
Given user is at home page
When user search a product 
Then user see the product details
And user can see the product price

@smoke 
Scenario: Sort by price of product
Given user is at home page
When user search a product 
And user apply sort for ascending
Then user see the product price in ascending order

@functional
Scenario: Sort by price of product in descending order
Given user is at home page
When user search a product 
And user apply sort for descending
Then user see the product price in descending order


