package OOPS;

public class TestCarInterface {

	public static void main(String[] args) {
		BMWImplementsInterface b = new BMWImplementsInterface();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();

		System.out.println("*************");
		CarInterface c = new BMWImplementsInterface();
		c.start();// BMW's method as preference given to overriden method(child
					// class methods)
		c.stop();
		c.refuel();
		// c.theftSafty(); No parent cannot able to inherit child's property
	}

	// dynamic polymorphism/top casting
	// child class obj can be refereed by parent interface ref var

}
