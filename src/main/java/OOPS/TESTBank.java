package OOPS;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hb = new HDFCBank();
		hb.bankDebit();
		hb.bankCredit();
		hb.loan();
		hb.funds();// hdfc's own method
		System.out.println("**************");
		Bank b = new HDFCBank();
		b.bankDebit();
		b.bankCredit();
		b.loan();
		// b.funds(); not avilable
		
	}

}
