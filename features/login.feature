Feature: amazon end to end functionality # feature goin to test


Background: Luanch the browser
Given chrome browser Luanched
When Launch the chrome browser

Scenario Outline: Login page  #scenario name 
Given user able to register new account      #prerequest 
When user the '<username>'  #actions
And user the '<password>'   #repeated in conjunctionn with given and when and then
And  user clicks on login button
Then amazon homepage wilb be launched sucessfully #validation
 Examples:
|username|password|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|
|hari|1234|
|keerthivasan|634|


Scenario: forget password page  #scenario name 
Given user able to generate  forget   password   #prerequest 
When user the new password  'vimal123' #actions
And user the re-new password  'vimal123'   #repeated in conjunctionn with given and when and then
And  user clicks on change password button
Then  sucessfully new password changed #validation
 