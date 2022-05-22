Feature: CheckoutProduct

@Registeredusercheckout
Scenario Outline: RRegisteredUserCheckoutProduct

    Given User is on Website home page
    When user clicked on register link
    And  user register with faker data "<FirstName>","<LastName>","<Email>","<Password>","<confirmpassword>" and click on register button 
    And verify user has register sucessfully
    And  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    And Check Search Result is matched with product name "<productname>" 
    And User click to add to card button 
    And User open shopping cart page to Verify that product added sucessfully to shopping cart 
    And User Checkout product 
    And User verify that he is on checkout page sucessfully 
    And User enter billing address details country, "<city>","<address>","<postalcode>","<phonenumber>" and click continue button 
    And User choose Shipping method
    And User choose payment method  
    And User confirm payment information
    And User Confirm order 
    And User verify order check out sucessfully 
    And view order details to dwonload pdf invoice 
    
     
   
      
        Examples: 
      | FirstName |LastName | Email | Password | confirmpassword | partialproductname | productname               |country | city|address|postalcode|phonenumber|
      |           |         |       |          |                 | mac                | Apple MacBook Pro 13-inch |        |     |       |          |           |
    
       
     
    
  
   
   
    


    
    
     
     
   