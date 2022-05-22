Feature: Registeration
@FakerData
  Scenario Outline: Register in Website with valid data
    Given User is on Website home page
    When user clicked on register link
    And user register with faker data "<FirstName>","<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    Then verify user has register sucessfully
    
    Examples: 
      | FirstName |LastName | Email         | Password | confirmpassword |
      |           |        |                |          |                 |
    
     
      
         
  
  

       