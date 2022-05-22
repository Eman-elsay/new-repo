package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import pages.SearchPage;
import tests.TestBase;

public class SearchStep extends TestBase {
	
	SearchPage searchobj ; 
	
	
	
	
	@When("user user clicked on Search Box and enter {string} and click on  Search")
	public void user_user_clicked_on_search_box_and_enter_and_click_on_search(String productname) throws InterruptedException {
		searchobj=new SearchPage(driver);
	    Thread.sleep(2000);
	    searchobj.Search(productname);
	}
	@Then("verify Search Result is matched with product name {string}")
	public void verify_search_result_is_matched_with_product_name(String productname) {
		
		
	   searchobj.OpenProductDetailsPage();
	   searchobj=new SearchPage(driver);
	   Assert.assertTrue(searchobj.productNameonproductpage.getText().equalsIgnoreCase(productname));
	}


}
