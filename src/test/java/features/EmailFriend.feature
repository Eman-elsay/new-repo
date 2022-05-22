Feature: Email friend

@emailtofriend
Scenario Outline: Search for product
    Given User is on Website home page
    When user clicked on register link
    And  user register with faker data "<FirstName>","<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    And verify user has register sucessfully 
    And  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    And Check Search Result is matched with product name "<productname>"    
    And   User Click on emailfriend button
    And  verify that user is on email to friend page  
    And  User enter "<Friendemail>"  and click on Send email 
       
    
    Examples: 
     | FirstName |LastName | Email          | Password | confirmpassword |      partialproductname |   productname             |Friendemail   |
      |           |         |                |          |                 |  mac                  | Apple MacBook Pro 13-inch |  eman@dxc.com|
   
   
   
    


    
    
     
     
   