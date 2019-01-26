package Practical;

public class Swapwithoutthirdvar {

	public static void main(String[] args) {
		
	int x=5;
	int y=10;
	
	System.out.println("Before Swapping value of x "+x);
	System.out.println("Before swapping value of y  "+y);
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("After Swapping value of x  "+x);
	System.out.println("After swapping value of y  "+y);	
	
	}

}
