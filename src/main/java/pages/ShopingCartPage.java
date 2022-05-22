package pages;





import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ShopingCartPage extends PageBase {

	public ShopingCartPage(WebDriver driver) {
		super(driver);
		
		jse = (JavascriptExecutor) driver; 
		
	}
	

	@FindBy(id="termsofservice")
	WebElement agreeCheckbox;  

	@FindBy(id="checkout")
	WebElement checkoutBtn  ; 

	@FindBy(id="updatecart")
	WebElement updatecart  ; 
	
	@FindBy(id="open-estimate-shipping-popup")
	WebElement estimateshipping  ; 
	
	public void openCheckoutPage() throws InterruptedException
	
	{
		scrollToBottom();
		Thread.sleep(2000);
		agreeCheckbox.click();
		Thread.sleep(2000);
		checkoutBtn.click();
	}
}
