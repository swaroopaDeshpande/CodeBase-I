package Practical;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		sortString("swaroopa");

	}

	public static void sortString(String str) {

		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String sortedString = new String(ch);
		System.out.println(sortedString);

	}

}
