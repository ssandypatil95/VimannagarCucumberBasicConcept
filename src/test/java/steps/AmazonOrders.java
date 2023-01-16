package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonOrders {
	
	
	@Given("user should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   
		System.out.println("Given method for login to application");
	}

	@When("user click on previous order")
	public void user_click_on_previous_order() {
		System.out.println("When method for previous order");
	}

	@Then("user should see the previous order details")
	public void user_should_see_the_previous_order_details() {
		System.out.println("then method for previous order");
	}

	@When("user click on order")
	public void user_click_on_order() {
		System.out.println("When method for current order");
	}

	@Then("user should see the order details")
	public void user_should_see_the_order_details() {
		System.out.println("then method for current order");
	}

	@When("user click on cancelled order")
	public void user_click_on_cancelled_order() {
		System.out.println("When method for cancelled order");
	}

	@Then("user should see the cancelled order details")
	public void user_should_see_the_cancelled_order_details() {
		System.out.println("Then method for cancelled order");
	}

}
