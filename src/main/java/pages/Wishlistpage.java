package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistpage extends PageBase{

	public Wishlistpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css = "td.product")
    public WebElement productCell;


}
