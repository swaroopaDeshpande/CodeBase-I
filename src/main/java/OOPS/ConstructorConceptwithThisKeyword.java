package OOPS;

public class ConstructorConceptwithThisKeyword {
	// can we overload constructor? yes we can , we can create default,one
	// param,two param constructor.
	// whenever i create object default constructor is getting called.
	// what is constructor?-->it's an class entity ,whenever we are creating an
	// object and need to define class property in the form of global varibles
	// we need constructor
	// class varibles -init use this same construtor varname like class name
	int age;
	String name;

	public ConstructorConceptwithThisKeyword()// 0 parameter constructor
	{
		System.out.println("Default constructor");
	}

	public ConstructorConceptwithThisKeyword(int i) {
		System.out.println("1 parameter constructor");
		System.out.println(i);
	}

	public ConstructorConceptwithThisKeyword(int i, int j) {
		System.out.println("2 parameters constructor");
		System.out.println(i);
		System.out.println(j);
	}

	public ConstructorConceptwithThisKeyword(int age, String name) {
		this.name = name;// this.name= local vars
		this.age = age;
		
	}

	public static void main(String[] args) {

		ConstructorConceptwithThisKeyword obj = new ConstructorConceptwithThisKeyword();
		ConstructorConceptwithThisKeyword obj1 = new ConstructorConceptwithThisKeyword(10);
		ConstructorConceptwithThisKeyword obj2 = new ConstructorConceptwithThisKeyword(10, 20);
		ConstructorConceptwithThisKeyword obj3 = new ConstructorConceptwithThisKeyword(30, "Swaroopa");
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
