Feature: Test programmanagement smoke scenario


Scenario: Test login with valid credential

Given Open Chrome and start application
When I enter valid user name "lbarinstein+qaadmin@remedypartners.com" and valid passowrd "Testing1"
Then user should be able to loggedIn successfully
