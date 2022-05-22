package stepDefinitions;



import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.CheckoutPage;
import pages.ProductDetails;
import pages.ShopingCartPage;
import tests.TestBase;

public class RegisteredUserCheckoutProduct extends TestBase {
	
	
	ProductDetails detailobj;
	ShopingCartPage shopobj;
	CheckoutPage checkoutobj;
	@When("User click to add to card button")
	public void user_click_to_add_to_card_button() throws InterruptedException {
		detailobj= new ProductDetails(driver);
		detailobj.addtocart();
	   
	}
	@When("User open shopping cart page to Verify that product added sucessfully to shopping cart")
	public void user_open_shopping_cart_page_to_verify_that_product_added_sucessfully_to_shopping_cart() {
		detailobj.opencartpage();
	   
	}
	
	@Then("User Checkout product")
	public void user_checkout_product() throws InterruptedException {
		shopobj= new ShopingCartPage(driver) ;
	//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		shopobj.openCheckoutPage();
	}
	
	@Then("User verify that he is on checkout page sucessfully")
	public void user_verify_that_he_is_on_checkout_page_sucessfully() {
		checkoutobj= new CheckoutPage(driver);
	   Assert.assertTrue(checkoutobj.checkoutpagetiltle.isDisplayed());
	}
// complete checkout details 
	
	@When("User enter billing address details country, {string},{string},{string},{string} and click continue button")
	public void user_enter_billing_address_details_country_and_click_continue_button( String city, String address, String postalcode, String phonenumber) throws InterruptedException {
		checkoutobj= new CheckoutPage(driver); 
		checkoutobj.entercheckoutdetails( city, address, postalcode , phonenumber);
		
	}
	@When("User choose Shipping method")
	public void user_choose_shipping_method() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User choose payment method")
	public void user_choose_payment_method() {
	   
	}
	@When("User confirm payment information")
	public void user_confirm_payment_information() {
	   
	}
	@When("User Confirm order")
	public void user_confirm_order() {
	  
	}
	@When("User verify order check out sucessfully")
	public void user_verify_order_check_out_sucessfully() {
	
	}
	@When("view order details to dwonload pdf invoice")
	public void view_order_details_to_dwonload_pdf_invoice() {
	    
	}



}
