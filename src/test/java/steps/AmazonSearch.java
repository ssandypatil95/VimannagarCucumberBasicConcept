package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch {
	

@Given("I have a search field on home page")
public void i_have_a_search_field_on_home_page() {
    System.out.println("Given specific method");
}

@When("I entered the product as {string}")
public void i_entered_the_product_as(String string) {
	 System.out.println("When specific method");
}

@When("I click on Search button")
public void i_click_on_search_button() {
	System.out.println("And specific method");
}

@Then("mobile phone should get display")
public void mobile_phone_should_get_display() {
	System.out.println("Then specific method");
}

}
