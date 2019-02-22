package InterfaceChanges_Version8;

public class TestStaticMethodsInInterface extends StaticMethodOfInterfaceImplementingClass
		implements StaticMethodsInInterface, StaticMethodInInterface_2 {

	public static void main(String[] args) {

		TestStaticMethodsInInterface obj = new TestStaticMethodsInInterface();

		obj.showInterest();
		StaticMethodsInInterface.showInterest();
		StaticMethodInInterface_2.showInterest();
		
	}
	

}
