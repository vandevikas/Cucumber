package step_definitions;

import org.testng.Assert;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.Account;
import implementation.KnowsTheDomain;
import implementation.Money;
import implementation.MoneyConverter;

public class CashWithdrawalSteps {
	private Account myAccount;
	KnowsTheDomain helper;
	
	public CashWithdrawalSteps() {
		helper = new KnowsTheDomain();
	}


	

	@Then("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable {
		Assert.assertEquals(dollars, helper.getCashSlot().getContents());
	}

}
