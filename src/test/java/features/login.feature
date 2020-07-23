Feature: facebook login functionality
 Scenario: Login facebook with valid user
 Given User is on login page
 When Enter username "shivangi.jain23@gmail.com"
 And Enter  password "test123"
 And click on submit button
 Then User should be able to login successfully
  
  Scenario: Login facebook with invalid user
 Given User is on login page
 When Enter username "jain.jain23@gmail.com"
 And Enter  password "test345"
 And click on submit button
 Then User should not be able to login successfully
