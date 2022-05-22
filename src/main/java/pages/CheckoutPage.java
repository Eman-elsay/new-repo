package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class CheckoutPage extends PageBase {
	
	Faker fakeData = new Faker(); 
	String fakeCity = fakeData.country().capital();
	String fakeaddress = fakeData.address().buildingNumber();
	String fakePostalcode = fakeData.number().digits(6);
	String fakephonenum = fakeData.phoneNumber().phoneNumber();
	

	public CheckoutPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
	public WebElement checkoutpagetiltle;

	@FindBy(id="BillingNewAddress_FirstName")
	public WebElement Fname;


	@FindBy(id="BillingNewAddress_LastName")
	public WebElement lname;

	@FindBy(id="BillingNewAddress_CountryId")
	public WebElement country;

	@FindBy(id="BillingNewAddress_City")
	public WebElement city;

	@FindBy(id="BillingNewAddress_Address1")
	public WebElement address1;


	@FindBy(id="BillingNewAddress_PhoneNumber")
	public WebElement postalcode;


	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
	public WebElement continuebtn ;



	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public WebElement phone;
	
	@FindBy(id="BillingNewAddress_StateProvinceId")
	public WebElement province;
	
	@FindBy(id="shippingoption_1")
	public WebElement pmtmethod;
	
	@FindBy(id="shipping-method-please-wait")
	public WebElement continuepmtmethod;
	
	@FindBy(id="shipping-method-please-wait")
	public WebElement moneytransfer;



public void entercheckoutdetails(String City ,String Postalcode , String address ,String phonenum ) throws InterruptedException
{
	Select drop = new Select(country);
    drop.selectByIndex(1);
    
    Select state = new Select(province);
    state.selectByValue("53");
	
	city.sendKeys(City +fakeCity );
	
	address1.sendKeys(address + fakeaddress);
	
	postalcode.sendKeys(Postalcode + fakePostalcode);
	
	phone.sendKeys(phonenum + fakephonenum);

	continuebtn.click();
		
}
public void choosepmtmethod()
{
	pmtmethod.click();
	continuepmtmethod.click();
	
	
}
} 
