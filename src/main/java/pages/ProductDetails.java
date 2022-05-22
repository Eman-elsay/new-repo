package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails  extends PageBase{

	public ProductDetails(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
	}

	@FindBy(id="add-to-wishlist-button-4")
	WebElement WishListbtn; 

	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button")
	WebElement addToCompareBtn ; 

	@FindBy(linkText="product comparison")
	WebElement comparelist;

	@FindBy(xpath = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[3]/button")
	WebElement emailFriendBtn ; 


	@FindBy(linkText = "Add your review")
	WebElement addreview ; 

	@FindBy(id="add-to-cart-button-4")
	WebElement addToCartBtn ; 



	@FindBy(linkText = "shopping cart")
	WebElement shopingcart  ; 

	@FindBy(xpath = "//*[@id=\"flyout-cart\"]/div/div[4]/button")
	WebElement gotoshopingcart  ; 


	// add to wish list

	public void addtowishlist() 
	{
		WishListbtn.click();
	}

	// add to compare list
	public void Addtocomparelist() 
	{
		addToCompareBtn.click();
	}

	// open compare page 
	public void opencomparelistpage()
	{
		comparelist.click();
	}

	// open 
	public void openemailfriendpage()
	{
		emailFriendBtn.click();
	}

	public void openaddreviepage()
	{
		addreview.click();
	}

	// add  to cart
	public void addtocart() throws InterruptedException
	{
		 Thread.sleep(2000);
	
		addToCartBtn.click();
		
		 Thread.sleep(2000);
		
	}

	// open   to cart shopping page 
	public void opencartpage()
	{
		shopingcart.click();
		
	}
}
