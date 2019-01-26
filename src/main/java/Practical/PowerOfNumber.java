package Practical;

public class PowerOfNumber {

	public static void main(String[] args) {
		long result = 1;
		int base = 3;
		int exponent = 4;

		while (exponent != 0) {
			result = result * base;
			--exponent;
		}

		System.out.println(result);

	}

}
