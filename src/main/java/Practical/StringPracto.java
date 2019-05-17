package Practical;

public class StringPracto {

	public static void main(String[] args) {
		// String reverse but keep first letter constant
		reverseExceptFirstLetter("Test");

	}

	public static String reverseExceptFirstLetter(String str) {
		String revereseStr = "";
		String finalOutput = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {			
			char first_Letter = str.charAt(0);
			if (str.charAt(i) == first_Letter) {
				str.charAt(i);
			} else {
				revereseStr = revereseStr + str.charAt(i);
				finalOutput = first_Letter + revereseStr;
			}

		}
		System.out.println(finalOutput);
		return finalOutput;

	}
}