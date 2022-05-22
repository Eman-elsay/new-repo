package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToComparepage;

import pages.ProductDetails;

import tests.TestBase;

public class Addtocomparelist extends TestBase{

	ProductDetails detailsobj;
	 
	AddToComparepage compareobj;
	
	@When("Add product to compare list")
	public void add_product_to_compare_list() throws InterruptedException {
		detailsobj= new ProductDetails(driver);
		Thread.sleep(2000);
		detailsobj.Addtocomparelist();;
		
		Thread.sleep(2000);
	   
	}
	@Then("Verify that product add successfully to compare list  {string}")
	public void verify_that_product_add_successfully_to_compare_list(String productname) throws InterruptedException {
		
		detailsobj.opencomparelistpage();
		compareobj= new AddToComparepage(driver);
		
		
		 Assert.assertEquals(compareobj.comparedproductname.getText(), productname);
		//Assert.assertTrue(wishlistobj.productCell.getText().contains(productname));
		 
			Thread.sleep(2000);
	    
	    
	}

	
}
