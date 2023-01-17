package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {
	
	@Given("user is at home page")
	public void user_is_at_home_page() {
	    System.out.println("Given statement");
	}

	@When("user search a product")
	public void user_search_a_product() {
	 System.out.println("When statement for product search");
	}

	@Then("user see the product details")
	public void user_see_the_product_details() {
		System.out.println("Then statement for product details");
	}

	@Then("user can see the product price")
	public void user_can_see_the_product_price() {
		System.out.println("Then statement for product price");
	}

	@When("user apply sort for ascending")
	public void user_apply_sort_for_ascending() {
		System.out.println("When statement for ascending order");
	}

	@Then("user see the product price in ascending order")
	public void user_see_the_product_price_in_ascending_order() {
		System.out.println("Then statement for arrange in ascending order");
	}

	@When("user apply sort for descending")
	public void user_apply_sort_for_descending() {
		System.out.println("When statement for descending order");
	}

	@Then("user see the product price in descending order")
	public void user_see_the_product_price_in_descending_order() {
		System.out.println("Then statement for arrange in descending order");
	}
}
