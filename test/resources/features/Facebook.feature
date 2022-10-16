Feature: To validate Facebook home page

Scenario OutLine: Verifying FB page title

Given User launches FB webpage

When User click create an account

And User enters "<firstName>", "<lastName">, "<mobileNo>", "<password>","<yearOFBirth>", "<gender>" in signUp page
And User enters signUp button
Then user verify the message

Examples: 
|firstName|lastName|mobileNo|password|yearOFBirth|gender|
|Prasanthi|Etigowni|1234567890|India@123|1989|F|