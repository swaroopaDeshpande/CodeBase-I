package Practical;

import java.util.Arrays;

public class ArrayLargestTwoNum {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 500;
		arr[4] = 20;

		System.out.println("Arrays are : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Arrays are : " + Arrays.toString(arr));
		

	}

}
