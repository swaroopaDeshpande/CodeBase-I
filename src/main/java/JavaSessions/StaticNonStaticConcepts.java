package JavaSessions;

public class StaticNonStaticConcepts {
	// class vars-global vars+class methods=class members
	String name = "Tom";
	static int age = 30;

	public static void main(String[] args) {

		// access non static : class var name and method sendMail()-->Need to
		// create object and access via obj ref
		// access static-static stored in permant Generation/Meta Space--method area static
		//now permant generation is absolute and now its metaspace
		// is not part of object
		// in car : every car have 4 wheels -->define static int wheels =4;
		// common feature, common memory allocation
		StaticNonStaticConcepts obj = new StaticNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		System.out.println(age);
	}

	// class methods
	public void sendMail() {
		System.out.println("Send mail method");
	}

	public static void sum() {
		System.out.println("sum method");
	}

}
