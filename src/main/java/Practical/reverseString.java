package Practical;

public class reverseString {

	public static void main(String[] args) {
		String str = "Swara";
		String rev = "";
		// 1.using for loop
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
