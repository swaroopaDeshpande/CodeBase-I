package Practical;

public class FactorialNumberwithoutRecurrsion {

	public static void main(String[] args) {
		// facto(0)=1
		// facto(1)=0

		System.out.println(factorial(5));
		System.out.println(fact(5));
	}

	public static int factorial(int number) {
		int facto = 1;

		if (number == 0)
			return 1;
		for (int i = 1; i <= number; i++) {
			facto = facto * i;
		}

		return facto;
	}

	// recurrsive
	public static int fact(int number) {
		if (number == 0)
			return 1;
		else
			return (number * fact(number - 1));
	}

}
