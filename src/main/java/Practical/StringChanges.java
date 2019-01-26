package Practical;

public class StringChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strChanges("Name is Smith");	
		strChanges("Swaroopa is name");
		strChanges("Test is temp");
		strChanges("Test is Test");
	}
	
	
	public static void strChanges(String str)
	{
		String temp;
		
		String arr[]=str.split(" ");
		temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		
		for(String s1:arr)
		{
			System.out.println(s1);
		}		
	}
}
