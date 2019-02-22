package InterfaceChanges_Version8;

public interface BankInJdk_Version8 {

	void intrestOnFD();

	default public void customerInfo() {
		System.out.println("Bank--Default Method in Interface-JDK 1.8 onwards");
	}

}
