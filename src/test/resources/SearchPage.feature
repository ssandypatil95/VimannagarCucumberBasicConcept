Feature: Amazon Search
Scenario: Search a Product
Given I have a search field on home page
When I entered the product as "mobile phone"
And I click on Search button
Then mobile phone should get display