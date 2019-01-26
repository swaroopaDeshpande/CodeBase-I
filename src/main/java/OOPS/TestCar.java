package OOPS;

public class TestCar {

	public static void main(String[] args) {
		// b-->Object reference varible
		// new BMW()
		// BMW-class

		BMW b = new BMW();
		// polymorphsm:poly many,morphisum-diffrent forms of method
		// Method overloading--same or inheritance class we have same method
		// name but diff no of parameters or different types of paarameters.
		// java compiler decide which method to call
		// start is already avlb in BMW
		// pref given to child class method
		// Compile time polymorphisum

		b.start();// BMW's start Method
		b.stop();// BMW's stop method
		b.refuel();// Car's class inheriting method
		b.theftSafety();// BMW's own method

		System.out.println("*********************");

		Car c = new Car();
		c.start();
		c.stop();//overloading-Car class stop method have one parameter ,BMW have zero parameter
		c.refuel();
		// c.theftSafety(); cannot access child's property

		System.out.println("*********************");
		// Child class object can be access by parent class reference varible
		// dynamic polymorphism
		// Method overriding:Car class-start() same method name same no of
		// prameters in BMW class start() method
		// top casting
		Car obj = new BMW();
		obj.start();// First control goes to Car class method but at runtime
					// preference given to overriden method that is CHild class
					// method
		obj.stop();// BMW stop
		obj.refuel();// Car class
		// obj.theftSafety// not able to inherit child's property

		System.out.println("*********************");

		// Child cannot hold parent BMW b=new Car();
		// downcasting/casting
		// BMW b1=(BMW )new Car(); *#* ClassCastException--downcastinng not
		// allowed in java

	}

}
