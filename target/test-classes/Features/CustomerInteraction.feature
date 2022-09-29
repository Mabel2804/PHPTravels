#Customers should be able to login to the website. When they logged in they should be able to see their name. They should be able to access their
#profile. They should be able to update their profile and see the changes.

Feature: Customer login to website

Scenario Outline: Login to PHP Travels page and update the profile
Given User is at the PHP Travels website
When User wants to login to the travel portal
And User enters login credentials <username> and <password>
Then User should be able to login to the travel portal and see their name
And User is able to update their profile

Examples:
|username                  |password  |
|user@phptravels.com       |demouser  |


