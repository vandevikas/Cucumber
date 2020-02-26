package implementation;

public class KnowsTheDomain {

	private Account myAccount;
	private CashSlot cashSlot;

	public Account getMyAccount() {
		if (myAccount == null) {
			myAccount = new Account();
		}
		return myAccount;
	}

	public CashSlot getCashSlot() {
		if (cashSlot == null) {
			cashSlot = new CashSlot();
		}
		return cashSlot;
	}

	public Teller getTeller() {
		// TODO Auto-generated method stub
		return null;
	}
}
