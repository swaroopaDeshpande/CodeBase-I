package Practical;

import java.util.Scanner;

public class FibboSeries {

	public static void main(String[] args) {
		// The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter range");
		int range=scan.nextInt();
		int first=0;
		int second=1;
		int last=0;
		String  temp="";
		
		for(int i=0;i<=range;i++)
		{
			last=first+second;
			first=second;
			second =last;
			temp=temp+last+",";
		
		}
		System.out.println(temp);
		  
	}

}
