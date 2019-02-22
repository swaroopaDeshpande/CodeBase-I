package Practical;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int[] arr = { 55, 2, 14, 7, 32, 5, 30, 22, 11 };

		int max=LargestNumberInArray(arr);
		System.out.println(max);

	}

	public static int LargestNumberInArray(int[] arr) {
		int Max=0;

		for (int i = 0; i < arr.length; i++) {
			
				if (arr[i] > Max) {
					Max=arr[i];
					
				}
			}
		return Max;
		
}}
