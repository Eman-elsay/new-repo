package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddReviewPage;
import pages.ProductDetails;
import tests.TestBase;

public class AddReviewStep extends TestBase {
	ProductDetails detailobj;
	AddReviewPage reviewobj;
	
	@When("User Click on add review button")
	public void user_click_on_add_review_button() {
	    detailobj=new ProductDetails(driver);
	    detailobj.openaddreviepage();
	}
	@When("verify that user is on review page")
	public void verify_that_user_is_on_review_page() throws InterruptedException {
		
		reviewobj=new AddReviewPage(driver);
	   Assert.assertTrue(reviewobj.submitreviewBtn.isDisplayed());
	   Thread.sleep(2000);
	}
	@When("User enter {string} , {string},choose review rate and click on submit review")
	public void user_enter_choose_review_rate_and_click_on_submit_review(String reviewtitle, String reviewtext) {
		reviewobj=new AddReviewPage(driver);
		reviewobj.addreview(reviewtitle, reviewtext);

	}
	@Then("user verify that review added sucessfully")
	public void user_verify_that_review_added_sucessfully() {
		
		Assert.assertTrue(reviewobj.sucessreview.getText().contains("Product review is successfully added."));
	   
	}

}
