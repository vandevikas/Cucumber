package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FundTransferSteps {
	
	@Given("^I have deposited \\$(\\d+) in my (\\w+) Account$")
	public void iHaveDeposited$InMyCheckingAccount(int amount, String accountType) throws Throwable {
	    System.out.println(amount + accountType);
	}

	@When("^I transfer \\$(\\d+) from my (\\w+) Account into my (\\w+) Account$")
	public void iTransfer$FromMySavingsAccountIntoMyCheckingAccount(int amount, String savings, String current) throws Throwable {
	    System.out.println(amount + savings + current);
	}

	@Then("^the balance of the (\\w+) Account should be \\$(\\d+)$")
	public void theBalanceOfTheCheckingAccountShouldBe$(String accountType, int amount) throws Throwable {
		System.out.println(accountType + amount);
	    
	}


}
