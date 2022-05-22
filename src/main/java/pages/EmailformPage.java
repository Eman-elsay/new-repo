package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailformPage extends PageBase{

	public EmailformPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="send-email")
    public WebElement sendemailbtn;
	
	@FindBy(id="FriendEmail")
     WebElement emailfriendfield;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]")
	public  WebElement successmsg;
	
	
	
	
	public void sendmailtofriend(String friendmail ) throws InterruptedException
	{
		emailfriendfield.sendKeys(friendmail);
		Thread.sleep(2000);
		sendemailbtn.click();
		
	}
}
