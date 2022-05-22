package stepDefinitions;


import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ProductDetails;
import pages.SearchPage;
import tests.TestBase;

public class AutoSearch extends TestBase{
	
	SearchPage searchobj ; 
	ProductDetails detailsobj;
	HomePage homeobj;

	


@When("user user clicked on Search Box and enter {string} and choose first option from auto suggest and Click search")
public void user_user_clicked_on_search_box_and_enter_and_choose_first_option_from_auto_suggest_and_click_search(String partialproductname) throws InterruptedException {
	searchobj=new SearchPage(driver);
	homeobj=new HomePage(driver);
 
    searchobj.Searchwithautosuggest(partialproductname);
}

@Then("Check Search Result is matched with product name {string}")
public void check_search_result_is_matched_with_product_name(String productname) {
	
	 Assert.assertTrue(searchobj.productNameonproductpage.getText().equalsIgnoreCase(productname));
   
}



	
   
}

