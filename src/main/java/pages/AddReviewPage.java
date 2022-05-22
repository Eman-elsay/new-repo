package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddReviewPage extends PageBase {

	public AddReviewPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="AddProductReview_Title")
	WebElement Reviewtitlefield; 


	@FindBy(id="AddProductReview_ReviewText")
	WebElement Reviewtextfield; 


	@FindBy(id="addproductrating_3")
	WebElement Reviewratingfield;

	@FindBy(name="add-review")
	public WebElement submitreviewBtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
	public WebElement sucessreview;


	//add review on product

	public void addreview(String reviewtitle ,String reviewtext) 
	{
		Reviewtitlefield.sendKeys(reviewtitle) ;
		Reviewtextfield.sendKeys(reviewtext);
		Reviewratingfield.click();
		submitreviewBtn.click();
	}


}
