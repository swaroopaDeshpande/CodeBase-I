package Practical;

public class fuzz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. for loop Write a program that prints the numbers from 1 to 100.
		 * But for 2. multiples of three print “Fizz” instead of the number and
		 * 3.for the multiples of five print “Buzz”. For numbers which are
		 * multiples of 4.both three and five print “FizzBuzz”. Print a new line
		 * after each string or number.
		 */

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizz Buzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
