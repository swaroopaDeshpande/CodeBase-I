package Practical;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		/*
		 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27
		 * So: 1+125+27=153
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check");
		int number = scan.nextInt();
		int temp=number;
		int sum=0;
		
		while(temp!=0)
		{
			int r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(number==sum)
		{
			System.out.println("It's an armstrong number");
			
		}
		else
		{
			System.out.println("It's not an armstrong number");
		}
	}

}
