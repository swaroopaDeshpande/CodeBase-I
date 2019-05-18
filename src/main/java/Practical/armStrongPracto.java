package Practical;

public class armStrongPracto {

	public static void main(String[] args) {
		isarmStrong(153);

	}

	public static void isarmStrong(int number) {
		int r;
		int sum = 0;
		int temp = number;

		while (temp != 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			number = number / 10;
		}
		if (number == sum) {
			System.out.println("it's armstrong");
		}

	}

}
