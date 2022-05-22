Feature: Registeration
@happy
  Scenario Outline: Register in Website with valid data
    Given User is on Website home page
    When user clicked on register link
    And user enter "<FirstName>","<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    Then verify user has register sucessfully

    Examples: 
      | FirstName |LastName | Email         | Password | confirmpassword |
      | eman      | khalid  | amoudnad@dxc.com|  123456  | 123456          |
   
      
      
         
  
  @nagative

  Scenario Outline: Register in Website with empty firstname data
    Given User is on Website home page
    When user clicked on register link
    And user enter "<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    Then verify spicific error msg appear sucessfully

   Examples: 
       |LastName | Email         | Password | confirmpassword |
      | eman  | emankhalid@dxc.com  |  1234567  | 1234567     |
      
      
      
    @nagative
   Scenario Outline: Register in Website with empty lastname 
    Given User is on Website home page
    When user clicked on register link
    And user enter "<FirstName>","<Email>","<Password>" and lastname is empty 
    Then verify errormsg for lastname appear successfully

    Examples: 
      | FirstName    | Email                  | Password |confirmpassword|
      | Testy        | Testyddffrfgvg@dxc.com | 123459   | 123459        |
  
   @nagative
  
   Scenario Outline: Register in Website with empty email 
    Given User is on Website home page
    When user clicked on register link
    And user enter  "<FirstName>", "<FirstName>","<Password>" and email is empty 
    Then verify errormsg for email appear successfully

    Examples: 
      | FirstName|LastName| Password |confirmpassword|
      | eman     | khalid | 123459   | 123459        |
  
   @nagative
  Scenario Outline: Register in Website with empty pass 
    Given User is on Website home page
    When user clicked on register link
    And user enter  "<FirstName>", "<FirstName>","<Email>" , "<confirmpassword>"  and pass is empty 
    Then verify errormsg for pass appear successfully

    Examples: 
      | FirstName|LastName| Email           |confirmpassword|
      | eman     | khalid | emany@dxc.com   | 123459        |
  
      
      