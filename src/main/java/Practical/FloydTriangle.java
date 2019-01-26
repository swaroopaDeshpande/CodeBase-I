package Practical;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range");
		int Range = sc.nextInt();
		int p = 1;
		for (int i = 1; i <= Range; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();

		}
	}

}
