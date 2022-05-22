package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.ProductDetails;


import pages.Wishlistpage;
import tests.TestBase;

public class AddToWishListStep  extends TestBase{
	
	ProductDetails detailsobj;
	HomePage homeobj;
	Wishlistpage wishlistobj;
	
	
	@Then("Add product to wish list")
	public void add_product_to_wish_list() throws InterruptedException {
		detailsobj= new ProductDetails(driver);
		Thread.sleep(2000);
		detailsobj.addtowishlist();
		
		Thread.sleep(2000);
		
	

}
	
	
	@Then("Verify that product add successfully to wish list  {string}")
	public void verify_that_product_add_successfully_to_wish_list(String productname) throws InterruptedException {
		
		homeobj= new HomePage(driver);
		homeobj.openwishlistpage();
		Thread.sleep(2000);
		wishlistobj=new Wishlistpage(driver);
		// Assert.assertEquals(wishlistobj.productinwishlist, productname);
		Assert.assertTrue(wishlistobj.productCell.getText().contains(productname));
		 
			Thread.sleep(2000);
	    
	}

}