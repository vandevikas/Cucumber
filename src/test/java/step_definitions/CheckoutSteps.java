package step_definitions;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import implementation.Checkout;


public class CheckoutSteps {
	int bananaPrice = 0;
	Checkout checkout= new Checkout();;
	
	@Then("^the total price should be (\\d+)c$")
	public void the_total_price_should_be_c(int total) throws Throwable {
	   Assert.assertEquals(checkout.total(), total);
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void i_checkout(int itemCount, String itemName) throws Throwable {
		checkout.add(itemCount, bananaPrice);   
	}	
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void the_price_of_a_is_c(String name, int price) throws Throwable {
		bananaPrice = price;
	}

}
