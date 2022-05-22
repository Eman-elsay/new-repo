package stepDefinitions;



import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserRegisteration;
import tests.TestBase;



public class RegisterStepWithExcelFile extends TestBase {
	HomePage home;
	UserRegisteration regist; 
	
		
		
	
	public RegisterStepWithExcelFile Register;
	
	//register with empty last name
	// read from excel file 
	
	@When("user register with data at excel file {string}")
	public void user_register_with_data_at_excel_file(String excelpath) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//register with empty last name

}


