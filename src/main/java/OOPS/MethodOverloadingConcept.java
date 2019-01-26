package OOPS;

public class MethodOverloadingConcept {

	public static void main(String[] args) {
		// Method overloading : method having same name with different set of
		// parameters or different types of parameters called method overloading
		/*
		 * Because when you extend a class, the subclass have all the methods
		 * defined by superclass. It is as if all the methods of superclass have
		 * been implemented by the subclass. That means the hello() method has
		 * been implemented by the class C as well. Now, you added a method in
		 * class C with different parameter (hello(String s)). That means, class
		 * C has two methods in all with same name but different parameters and
		 * that is "overloading".
		 * 
		 * Yes we can overload main method
		 * 
		 * 
		 * 
		 */
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.sum();
		obj.sum(10, 5);

	}

	public void sum() {
		System.out.println("Zero input parameter");
	}

	public void sum(int a, int b) {

		System.out.println(a);
		System.out.println(b);

	}
}
