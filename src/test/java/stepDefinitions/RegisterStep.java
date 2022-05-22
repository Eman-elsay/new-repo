package stepDefinitions;



import org.testng.Assert;

import data.ReadPropertiesfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegisteration;
import tests.TestBase;



public class RegisterStep extends TestBase {
	HomePage home;
	UserRegisteration regist; 
	
	//read from property file 
		String propertyfileLastName = ReadPropertiesfile.userData.getProperty("LastName");
		String propertyfileEmail = ReadPropertiesfile.userData.getProperty("Email");
		String propertyfilePassword = ReadPropertiesfile.userData.getProperty("Password");
		String propertyfileconfirmpassword = ReadPropertiesfile.userData.getProperty("confirmpassword");
		
		
		
	
	public RegisterStep Register;
	
	



	@Given("User is on Website home page")
	public void user_is_on_website_home_page() throws InterruptedException {
		home=new HomePage(driver);
		Thread.sleep(2000);
	


	}
	@When("user clicked on register link")
	public void user_clicked_on_register_link() {
		home.openregisterationpage();
		Assert.assertTrue(driver.getCurrentUrl().contains("register")) ;

	}

	//register with valid data
	@When("user enter {string},{string},{string},{string},{string} and click on register button")
	public void user_enter_and_click_on_register_button(String FirstName , String LastName , String Email, String Password ,String confirmpassword) throws InterruptedException {
		regist= new UserRegisteration(driver);
		regist.fillregisterform(FirstName, LastName, Email ,Password, confirmpassword); 
		Thread.sleep(2000);


	}
	
	
	@Then("verify user has register sucessfully")
	public void verify_user_has_register_sucessfully() throws InterruptedException {

	//	regist.userLogout();
		//Thread.sleep(2000);



	}

	//register with empty first name

	@Then("^verify spicific error msg appear sucessfully$")
	public void verify_spicific_error_msg_appear_sucessfully()  {

		regist.verifyappearerrormsg();
	}
//read from property file 
	@When("user enter {string},{string},{string},{string} and click on register button")
	public void user_enter_and_click_on_register_button(String LastName , String Email, String Password, String confirmpassword1) throws InterruptedException{
        regist= new UserRegisteration(driver);
		regist.fillregisterformwithemptyfname(LastName + propertyfileLastName, Email + propertyfileEmail , Password + propertyfilePassword,  Password + propertyfilePassword ); 

	}

	
	
	//register with empty last name

@When("user enter {string},{string},{string} and lastname is empty")
public void user_enter_and_lastname_is_empty(String FirstName , String email, String password) throws InterruptedException {
		regist= new UserRegisteration(driver);
		regist.fillregisterformwithemptylname(FirstName, email, password, password);
		

	}
	@Then("verify errormsg for lastname appear successfully")
	public void verify_errormsg_for_lastname_appear_successfully() {
		
		regist.verifyappearerrormsgforlastname();

	}
	
	//register with empty email
	
	@When("user enter  {string}, {string},{string} and email is empty")
	public void user_enter_and_email_is_empty(String FirstName, String lastname, String password) throws InterruptedException {
		regist= new UserRegisteration(driver);
		regist.fillregisterformwithemptyemail(FirstName, lastname, password, password) ;
	   
	}
	@Then("verify errormsg for email appear successfully")
	public void verify_errormsg_for_email_appear_successfully() {
		regist.verifyappearerrormsgforemail();
		
	   
	}
	
	//register with empty pass
	
	@When("user enter  {string}, {string},{string} , {string}  and pass is empty")
	public void user_enter_and_pass_is_empty(String FirstName, String lastname, String email, String password) throws InterruptedException {
		regist= new UserRegisteration(driver);
		regist.fillregisterformwithemptypass(FirstName, lastname, email, password);
	   
	}
	@Then("verify errormsg for pass appear successfully")
	public void verify_errormsg_for_pass_appear_successfully() {
	   regist.verifyappearerrormsgforconfirmpass();
	}


}



