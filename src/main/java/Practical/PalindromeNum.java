package Practical;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		int sum=0;
		int t;
		int num=151;
		t=num;
		
		while(num>0)
		{
			r=num%10;//get the remender
			sum=(sum*10)+r;
			num=num/10;		
		}
		if(t==sum)
		{
			System.out.println("This is palindrome number");
		}
		else
		{
			System.out.println("It's not an palidrome number");
		}
	}

}
