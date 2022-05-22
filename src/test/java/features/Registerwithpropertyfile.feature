Feature: Registeration
@propertyfile
  Scenario Outline: Register in Website with empty firstname data
    Given User is on Website home page
    When user clicked on register link
    And user enter "<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    Then verify spicific error msg appear sucessfully

   Examples: 
       |LastName | Email | Password | confirmpassword |
       |         |      |          |                 |
      
      
      
   
 