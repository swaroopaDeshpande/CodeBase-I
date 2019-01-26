package Practical;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 30;
		i[2] = 5;
		System.out.println("Orginal array" + Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
	}

}
