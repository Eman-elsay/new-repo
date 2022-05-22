Feature: Search
@Search
  Scenario Outline: Search for product
    Given User is on Website home page
    When  user user clicked on Search Box and enter "<productname>" and click on  Search 
    Then verify Search Result is matched with product name "<productname>"

    Examples: 
     |   productname             |
     | Apple MacBook Pro 13-inch | 
    
     
     
   @autosearch
 Scenario Outline: Search for product
    Given User is on Website home page
    When  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    Then Check Search Result is matched with product name "<productname>"

    Examples:     
     |   partialproductname |   productname             |
     | mac                  | Apple MacBook Pro 13-inch | 
    
   
   
    
@wishlist
 Scenario Outline: Add product to Wishlist
    Given User is on Website home page
    When  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    And Check Search Result is matched with product name "<productname>"
    And Add product to wish list 
    Then Verify that product add successfully to wish list  "<productname>"

    Examples:     
     |   partialproductname |   productname             |
     | mac                  | Apple MacBook Pro 13-inch | 
     
     
     
     @comparelist
 Scenario Outline: Add product to comparelist
    Given User is on Website home page
    When  user user clicked on Search Box and enter "<partialproductname>" and choose first option from auto suggest and Click search  
    And Check Search Result is matched with product name "<productname>"
    And Add product to compare list 
    Then Verify that product add successfully to compare list  "<productname>"

    Examples:     
     |   partialproductname |   productname             |
     | mac                  | Apple MacBook Pro 13-inch | 