package step_definitions;

import org.testng.Assert;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import implementation.KnowsTheDomain;
import implementation.Money;
import implementation.MoneyConverter;

public class AccountSteps {
	
	KnowsTheDomain helper;

	public AccountSteps(KnowsTheDomain helper) {
		this.helper = new KnowsTheDomain();
	}
	
	@Given("^my account has been credited with \\$(\\d+)\\.(\\d+)$")
	public void myAccountHasBeenCreditedWith(@Transform(MoneyConverter.class) Money amount) throws Throwable {
		helper.getMyAccount().deposit(amount);
		//helper.getMyAccount().credit(amount);
		Assert.assertEquals(helper.getMyAccount().getBalance(), amount, "Incorrect account balance");

	}

	
	@Then("^the balance of my account should be \\$(\\d+)\\.(\\d+)$")
	public void theBalanceOfMyAccountShouldBe$(@Transform(MoneyConverter.class)Money amount) throws Throwable {
		Assert.assertEquals(amount, helper.getMyAccount().getBalance());
	}

}
