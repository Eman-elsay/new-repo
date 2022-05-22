package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToComparepage extends PageBase {

	public AddToComparepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText="Apple MacBook Pro 13-inch")
	public WebElement comparedproductname;

	

	
}

