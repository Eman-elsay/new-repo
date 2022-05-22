package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver) ;
		
	}
	
	
	@FindBy(linkText = "Register")
	WebElement RegisterLink;

	@FindBy(linkText = "Log in")
	WebElement LoginLink;
	
	@FindBy(linkText = "Wishlist")
	WebElement Wishlistlink;
	
	
	
	

	public void openregisterationpage()
	{
		RegisterLink.click();
	}
	
	public void openloginpage()
	{
		LoginLink.click();
	}
	
	public void openwishlistpage()
	{
		Wishlistlink.click();
	}
	

	
	
}
