package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id = "Email")
	WebElement loginEmail;

	@FindBy(id = "Password")
	WebElement loginpassword;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement loginbtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")
	WebElement emptymailerrormsg;
	
	public void login(String loginmail, String loginpass)
	{

		
		loginEmail.sendKeys(loginmail);
		loginpassword.sendKeys(loginpass);
		loginbtn.click();
		

	}
	
	public void verifyuserloginsucessfully() 
	{
		
		Assert.assertTrue(logout .isDisplayed());
	}
	//login with invalid email 
	
	public void loginwithinvalidemail(String loginmail, String loginpass)
	{

		
		loginEmail.sendKeys(loginmail);
		loginpassword.sendKeys(loginpass);
		loginbtn.click();
		

	}
	
	public void verifyappearerrormsgwhenloginwithinvalidmail() 
	{
		
		Assert.assertTrue(emptymailerrormsg.getText().contains("Login was unsuccessful. Please correct the errors and try again."));
	}
	
	

}
