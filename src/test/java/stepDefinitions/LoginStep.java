package stepDefinitions;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import tests.TestBase;

public class LoginStep extends TestBase {
	
	HomePage home;
	LoginPage loginobj;
	
	@When("user clicked on login link")
	public void user_clicked_on_login_link() throws InterruptedException {
		Thread.sleep(2000);
		home=new HomePage(driver);
		Thread.sleep(2000);
		home.openloginpage();;
	}
	@When("user Login with valid {string},{string} and click on login button")
	public void user_login_with_valid_and_click_on_login_button(String Email, String Password) throws InterruptedException {
	    loginobj=new LoginPage(driver);
	    Thread.sleep(2000);
	    loginobj.login(Email, Password);
	    Thread.sleep(2000);
	}
	@Then("verify user has Login sucessfully")
	public void verify_user_has_login_sucessfully() {
	    loginobj.verifyuserloginsucessfully();
	}
	
	//login with invalid email
	
	@When("user Login with invalid {string},{string} and click on login button")
	public void user_login_with_invalid_and_click_on_login_button(String invalidemial, String validpass) throws InterruptedException {
		
		
		loginobj=new LoginPage(driver);
	    Thread.sleep(2000);
	    loginobj.loginwithinvalidemail(invalidemial, validpass);
		loginobj=new LoginPage(driver);
	    Thread.sleep(2000);
	   
	}
	
	@Then("verify user error message appear sucessfully")
	public void verify_user_error_message_appear_sucessfully() {
	   loginobj.verifyappearerrormsgwhenloginwithinvalidmail();
	}


}
