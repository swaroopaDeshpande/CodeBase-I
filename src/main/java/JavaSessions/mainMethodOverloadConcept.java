package JavaSessions;

public class mainMethodOverloadConcept {
	// can we call main method from other class
	// yes as its a static in nature we can access it using by its name

	public static void main(String[] args) {
		// *#* can we overload main method?
		// same class when we have diff no of methods with same name with diff
		// no or type of argument is called method overloading.
		System.out.println("main method");
		main("swaroopa");
		main(10, 20);
		mainMethodOverloadConcept obj = new mainMethodOverloadConcept();
		obj.main();
	}

	public static void main(String str) {
		System.out.println("Method 1");
	}

	public static void main(int i, int j) {
		System.out.println("Method 2");
	}

	public void main() {
		System.out.println("Method 3");
	}

}
