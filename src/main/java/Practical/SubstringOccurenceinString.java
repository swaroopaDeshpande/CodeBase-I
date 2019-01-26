package Practical;

public class SubstringOccurenceinString {

	public static void main(String[] args) {

		String str = "this is Selenium testing and testing is not so easy,testing is positive or negative";

		String s1[] = str.split("testing");
		System.out.println(s1.length - 1);
	}

}
