package PatternPrograms;

import java.util.Scanner;

public class Pattern2 {

	/*
	*
	***
	*****
	*******
	*********
	
	 */

	public static void main(String[] args) {

		patternLogic();

	}

	public static void patternLogic() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range");
		int x = sc.nextInt();

		int p = 0;
		
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= i+p ; j++) {
				System.out.print("*");
			}
			System.out.println();
			p = p + 1;
		}

	}
}
