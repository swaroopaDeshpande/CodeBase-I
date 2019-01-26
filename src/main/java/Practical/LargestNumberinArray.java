package Practical;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int[] arr = { 12, 2, 14, 7, 32, 5, 23, 22, 11 };

		LargestNumberInArray(arr);

	}

	public static void LargestNumberInArray(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println(arr[(arr.length) - 2]);
	}

}
