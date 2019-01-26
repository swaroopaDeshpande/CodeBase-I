package OOPS;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanRate=5;

	public abstract void loan();// abstract method

	public void bankDebit() {
		System.out.println("Bank Debit");
	}

	public void bankCredit() {
		System.out.println("Bank Credit");
	}

}
