package stepdefination;


	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import packageforPageclass.loginpage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Automation_assersion.Compare;
import Newpackageforbaseclass.Createdriverinstance;
    

	@RunWith(Cucumber.class)
	public class StepDefination {
		
		public WebDriver driver;
		public loginpage login;

	    @Given("^User is on login page$")
	    public void user_is_on_login_page() throws Throwable {
	    	Createdriverinstance testdriver= new Createdriverinstance();
			driver= testdriver.createbrowser();
	    }

	    @When("^Enter username \"([^\"]*)\"$")
	    public void enter_username_something(String strArg1) throws Throwable {
	    	login = new loginpage(driver);
			login.LoginUserID("salu");
	    }

	    @Then("^User should be able to login successfully$")
	    public void user_should_be_able_to_login_successfully() throws Throwable {
	    	Compare assersion = new Compare();
			Assert.assertTrue(assersion.validateURL(driver, "https://www.facebook.com/"));
	    }

	    @Then("^User should not be able to login successfully$")
	    public void user_should_not_be_able_to_login_successfully() throws Throwable {
	    	Compare assersion = new Compare();
			Assert.assertFalse(assersion.validateURL(driver, "https://www.facebook.com/"));
	    }

	    @And("^Enter  password \"([^\"]*)\"$")
	    public void enter_password_something(String strArg1) throws Throwable {
	    	login.Loginpassword("salu"); 
	    	System.out.println(post jira 333);
	    }

	    @And("^click on submit button$")
	    public void click_on_submit_button() throws Throwable {
	    	 login.Submitbutton(); 
	    }

	}

