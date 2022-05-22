package stepDefinitions;



import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegisteration;
import tests.TestBase;



public class RegisterStepwithfakerdata extends TestBase {
	HomePage home;
	UserRegisteration regist; 
	
	
		
		
	
	public RegisterStepwithfakerdata Register;
	
	



	
	

	@When("user register with faker data {string},{string},{string},{string},{string} and click on register button")
	public void user_register_with_faker_data_and_click_on_register_button(String FirstName, String LastName, String Email, String Password, String confirmpassword) throws InterruptedException  {
		regist= new UserRegisteration(driver) ;
		regist.fillregisterformusingfakerdata(FirstName, LastName, Email ,Password, confirmpassword); 
		Thread.sleep(2000);
	
	   
	}
	
	
	



	}

	




