Feature: Add Review on Product

@addreview
Scenario Outline: Registerd User add review on product

    Given User is on Website home page
    When user clicked on register link
    And  user register with faker data "<FirstName>","<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    And verify user has register sucessfully
    And  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    And Check Search Result is matched with product name "<productname>"  
    And  User Click on add review button
    And  verify that user is on review page 
    And  User enter "<reviewtitle>" , "<reviewtext>",choose review rate and click on submit review 
    Then user verify that review added sucessfully 
      
        Examples: 
      | FirstName |LastName | Email          | Password | confirmpassword | partialproductname | productname               |reviewtitle                       | reviewtext                 |
      |           |         |                |          |                 | mac                | Apple MacBook Pro 13-inch | Apple MacBook Pro 13-inch review | Highly recommended product |
    
       
     
    
  
   
   
    


    
    
     
     
   