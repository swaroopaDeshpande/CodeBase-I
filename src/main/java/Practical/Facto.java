package Practical;

public class Facto {

	// facto 3=3*2*1=6

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorial=facto(0);
		System.out.println(factorial);
	}

	public static int facto(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
