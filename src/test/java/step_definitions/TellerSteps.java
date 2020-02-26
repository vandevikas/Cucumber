package step_definitions;

import cucumber.api.java.en.When;
import implementation.KnowsTheDomain;

public class TellerSteps {

	KnowsTheDomain helper;

	public TellerSteps(KnowsTheDomain helper) {
		this.helper = helper;
	}

	@When("^I withdraw \\$(\\d+)$")
	public void iRequest$(int dollars) throws Throwable {
		helper.getTeller().withdrawFrom(helper.getMyAccount(), dollars);
	}
}
