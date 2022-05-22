package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver drvier ; 
	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action;

	public PageBase( WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	};

		
	public void scrollToBottom() 

	{
		
		jse.executeScript("scrollBy(0,3000)"); 
	}
}
