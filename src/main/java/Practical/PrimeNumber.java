package Practical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scan.nextInt();
		boolean flag = false;

		if (number == 0 && number == 1) {
			System.out.println(number + " is not prime Number");
		} else 
			for (int i = 2; i <= number / 2; ++i) {
				flag = true;
					break;
				}
			
			if (!flag) {
				System.out.println("This is prime number");
			} else {
				System.out.println("Number is not prime number");

			}
		}
	}


