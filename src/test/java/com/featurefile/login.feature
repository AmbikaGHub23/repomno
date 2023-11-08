Feature: Login functionality check
Scenario Outline: user login to the application

Given launch the Application
When enter the "<UserName>" in email field
And enter the "<PassWord>" in password field
Then user click login button

Examples:
|UserName|PassWord|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
 |performance_glitch_user|secret_sauce|
 |locked_out_user|secret_sauce|