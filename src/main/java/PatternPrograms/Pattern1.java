package PatternPrograms;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 1
		 12
         123
         1234
         12345

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a range");
		int x=scan.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
