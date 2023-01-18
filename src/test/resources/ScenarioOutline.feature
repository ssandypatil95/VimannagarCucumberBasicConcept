Feature: login feature

Scenario Outline: login with different set of data
Given user is at the app login page
When user enters the username as "<username>"
And user enters the password as "<password>"
And user click on login button
Then user should not get logged into the application

Examples:
|username | password |
|correctusername | incorrectpassword |
|incorrectusername | incorrectpassword |
|incorrectusername | correctpassword |


