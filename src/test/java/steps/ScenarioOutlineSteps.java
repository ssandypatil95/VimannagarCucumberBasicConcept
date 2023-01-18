package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at the app login page")
	public void user_is_at_the_app_login_page() {
	   System.out.println("Given step");
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	 System.out.println("Entered username as "+ string);   
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
		 System.out.println("Entered password as "+ string);   
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	    System.out.println("click on login button");
	}

	@Then("user should not get logged into the application")
	public void user_should_not_get_logged_into_the_application() {
		 System.out.println("user should not get logged in");   
	}

}
