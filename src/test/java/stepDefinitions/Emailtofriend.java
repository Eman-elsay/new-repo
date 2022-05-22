package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmailformPage;
import pages.ProductDetails;
import tests.TestBase;

public class Emailtofriend extends TestBase{
	
	ProductDetails detailsobj;
	EmailformPage emailobj;
	
	@Then("User Click on emailfriend button")
	public void user_click_on_emailfriend_button() throws InterruptedException {
		
		detailsobj= new ProductDetails(driver);
		detailsobj.openemailfriendpage();
		Thread.sleep(2000);
		
	
		
		
	    	}
	

@Then("verify that user is on email to friend page")
public void verify_that_user_is_on_email_to_friend_page() {
	
	emailobj =new EmailformPage(driver);
	Assert.assertTrue(emailobj.sendemailbtn.isDisplayed());
	
}

@When("User enter {string}  and click on Send email")
public void user_enter_and_click_on_send_email(String friendemail) throws InterruptedException {
    

emailobj= new EmailformPage(driver);
emailobj.sendmailtofriend(friendemail);
Thread.sleep(2000);
Assert.assertTrue(emailobj.successmsg.getText().contains("Your message has been sent."));

}}
