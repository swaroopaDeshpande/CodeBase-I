package Practical;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {

		// String str = "madam";
		// String revereseStr = "";
		//
		// for (int i = str.length() - 1; i >= 0; i--) {
		// revereseStr = revereseStr + str.charAt(i);
		// }
		// System.out.println(revereseStr);
		//
		// if (str.equals(revereseStr)) {
		// System.out.println("String is palidrome");
		// } else {
		// System.out.println("String is not palidrome");
		// }

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check");

		String temp = "";
		String x = sc.nextLine();

		for (int i = 0; i < x.length(); i++) {
			temp = x.charAt(i) + temp;
		}

		if (x.equals(temp)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

}
