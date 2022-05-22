Feature: Login
@login
  Scenario Outline: Login with valid data
    Given User is on Website home page
    When user clicked on login link
    And user Login with valid "<Email>","<Password>" and click on login button 
    Then verify user has Login sucessfully

    Examples: 
     |   Email             | Password | 
     |   test1@dxc.com     |   12345678 |
    
     
     
   @negativelogin  
 Scenario Outline: Login with invalid email or pass
    Given User is on Website home page
    When user clicked on login link
    And user Login with invalid "<Email>","<Password>" and click on login button 
    Then verify user error message appear sucessfully 

    Examples:    
     |   Email                     | Password | 
     |   eman.khalidcc@dxc.xom     |   123456 |
    
         
  
  

       