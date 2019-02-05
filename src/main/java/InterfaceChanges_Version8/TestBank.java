package InterfaceChanges_Version8;

public class TestBank extends BankA implements BankInJdk_Version8, HdfcBankInJdk_Version8 {

	public static void main(String[] args) {
		TestBank obj = new TestBank();
		obj.customerInfo();
		obj.intrestOnFD();
		obj.creditCard();

	}

	@Override
	public void intrestOnFD() {
		System.out.println("Test Bank interest method");
	}

	@Override
	public void customerInfo() {
		BankInJdk_Version8.super.customerInfo();
		System.out.println("Overriden Method in TestBank class");
	}

	@Override
	public void creditCard() {
		System.out.println("Test Bank creditCard Method");
	}

}
