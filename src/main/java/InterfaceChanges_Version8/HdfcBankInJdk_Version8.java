package InterfaceChanges_Version8;

public interface HdfcBankInJdk_Version8 {

	void creditCard();

	default public void customerInfo() {
		System.out.println("HDFC--Default Method in Interface-JDK 1.8 onwards");
	}

}
