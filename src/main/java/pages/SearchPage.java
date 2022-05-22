package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="small-searchterms")
	WebElement SearchField;
	
	@FindBy(xpath = "//*[@id=\"small-search-box-form\"]/button")
	WebElement Searchbtn;
	
	@FindBy(linkText="Apple MacBook Pro 13-inch")
	WebElement productTitle; 
	
	@FindBy(css ="strong.current-item" )
	public WebElement productNameonproductpage;
	
	@FindBy(id="ui-id-1")
	List<WebElement> productList;

	
	 
	
	// SearcH 
		public void Search(String Productname)
		{
			SearchField.click();
			SearchField.sendKeys(Productname);
			Searchbtn.click();
		}
		
		public void OpenProductDetailsPage() 
		{
			(productTitle).click();
		}
		
//auto search 
		public void Searchwithautosuggest( String partialproductname ) throws InterruptedException 
		{
			
			SearchField.click();
			SearchField.sendKeys(partialproductname);
			Thread.sleep(2000);
		    productList.get(0).click();	
			
			
		}
		
		
		

		
		

}
