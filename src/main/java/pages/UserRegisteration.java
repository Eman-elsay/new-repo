package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.github.javafaker.Faker;




public class UserRegisteration extends PageBase {
	
	Faker fakeData = new Faker(); 
	String fakefirst = fakeData.name().firstName(); 
	String fakelast = fakeData.name().lastName(); 
	String fakeemail = fakeData.internet().emailAddress(); 
	String fakepass = fakeData.number().digits(8).toString();
	
	public UserRegisteration(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="gender-male")
	WebElement gender;

	@FindBy(id = "FirstName")
	WebElement Fname;

	@FindBy(id = "LastName")
	WebElement Lname;

	@FindBy(id = "Email")
	WebElement Email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmpassword;

	@FindBy(id= "register-button")
	WebElement registerbtn;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	
	@FindBy(id ="FirstName-error")
	WebElement fnameerrormsg;
	
	@FindBy(id ="LastName-error")
	WebElement Lnameerrormsg;
	

	@FindBy(id ="Email-error")
	WebElement emailerrormsg1;
	
	@FindBy(id ="Password-error")
	WebElement emptypasserrormsg;
	
	@FindBy(id ="ConfirmPassword-error")
	WebElement emptyconfirmpasserrormsg;
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")
	WebElement continueBTN;
	
	//happy scenario register with valid data 
	
	public void fillregisterform(String firstname , String lastname , String mail, String pass ,String confirmpass) throws InterruptedException
	{
		gender.click();
		
		Fname.sendKeys(firstname );
		
		Lname.sendKeys(lastname  );
		
		Email.sendKeys(mail);
		
		
		password.sendKeys(pass );
	
		confirmpassword.sendKeys(confirmpass);
	
	
		
		registerbtn.click();
	
		


	}
	
	// register with faker data 


	public void fillregisterformusingfakerdata(String firstname , String lastname , String mail, String pass ,String confirmpass) throws InterruptedException
	{
		gender.click();
		
		Fname.sendKeys(firstname + fakefirst);
		
		Lname.sendKeys(lastname + fakelast );
		
		Email.sendKeys(mail + fakeemail);
	
		
		password.sendKeys(pass + fakepass);
	
		confirmpassword.sendKeys(confirmpass + fakepass);
	
		registerbtn.click();
		
		continueBTN.click();
		Thread.sleep(1000);
	
		


	}
	
	public void userLogout() 
	{
		(logout).click();
	}
	
	public void fillregisterformwithemptyfname( String lastname , String mail, String pass ,String confirmpass) throws InterruptedException
	{
		gender.click();
		Lname.sendKeys(lastname);
		Email.sendKeys(mail);
		password.sendKeys(pass);
		confirmpassword.sendKeys(confirmpass);
		registerbtn.click();
	}
	
	public void verifyappearerrormsg() 
	{
		String errormsg= fnameerrormsg.getText();
		String expectedmsg = "First name is required.";
		Assert.assertEquals(errormsg, expectedmsg);
	}

	
	public void fillregisterformwithemptylname( String firstname , String mail, String pass ,String confirmpass) throws InterruptedException
	{
		gender.click();
		Thread.sleep(2000);
		Fname.sendKeys(firstname);
		Thread.sleep(2000);
		Email.sendKeys(mail);
		Thread.sleep(2000);
		password.sendKeys(pass);
		
		confirmpassword.sendKeys(confirmpass) ;
		Thread.sleep(2000);
		
		registerbtn.click();
	}

	public void verifyappearerrormsgforlastname() 
	{
		String LNerrormsg= Lnameerrormsg.getText();
		String expectedLNmsg = "Last name is required.";
		Assert.assertEquals(LNerrormsg, expectedLNmsg);
	}
	
	public void fillregisterformwithemptyemail( String firstname , String lastname, String pass ,String confirmpass) throws InterruptedException
	{
		gender.click();
		Fname.sendKeys(firstname);
		Lname.sendKeys(lastname);
		password.sendKeys(pass);
		
		confirmpassword.sendKeys(confirmpass) ;
		
		registerbtn.click();
	}
	public void verifyappearerrormsgforemail() 
	{
		String emailerrormsg= emailerrormsg1.getText();
		String expectedemailmsg = "Email is required.";
		Assert.assertEquals(emailerrormsg, expectedemailmsg);
	}
	
	public void fillregisterformwithemptypass(String firstname , String lastname , String mail, String pass) throws InterruptedException
	{
		gender.click();
		
		Fname.sendKeys(firstname);
		
		Lname.sendKeys(lastname);
		
		Email.sendKeys(mail);
		
		password.sendKeys(pass);
	
		registerbtn.click();
		
		Thread.sleep(2000);

	}
	
	public void verifyappearerrormsgforconfirmpass() 
	{
		String confirmpasserrormsg= emptyconfirmpasserrormsg.getText();
		String expectedpassmsg = "Password is required.";
		Assert.assertEquals(confirmpasserrormsg, expectedpassmsg);
	}




}
