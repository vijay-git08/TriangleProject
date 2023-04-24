Feature: Automating User Management Page

Scenario: Validating all functionality in User Management Page

Given Login as Superadmin 
When Clicking Filter by and selection one drop down options
And In user list table checking all names were  dispaying by scroll down 
And In serach text box entering name
And In user list table checking enterd name displaying
And Entering name for editing
And Click edit button
And Changing last name
And Clicking Update button
And Verifying Updated succesfully message and clicking cancel button
And click Profile Icon2
And click Account button
And changing Mobile Number
And clicking Update button2
And click Profile Icon
Then User Click Logout button

