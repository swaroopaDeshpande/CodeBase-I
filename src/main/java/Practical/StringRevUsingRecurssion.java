package Practical;

public class StringRevUsingRecurssion {

	public static void main(String[] args) {
		revString("Test");

	}

	public static String revString(String myStr)
	{
		
		if(myStr==null||myStr.length()<1){
			return myStr;
		}
		else
		return revString(myStr.substring(1))+myStr.charAt(0);

	}
}

