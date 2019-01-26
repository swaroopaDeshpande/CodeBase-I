package OOPS;

public class BMWImplementsInterface implements CarInterface {

	public void start() {
		System.out.println("BMW start");
	}

	public void stop() {
		System.out.println("BMW stop");
	}

	public void refuel() {
		System.out.println("BMW refuel");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW--TheftSafty");
	}

}
