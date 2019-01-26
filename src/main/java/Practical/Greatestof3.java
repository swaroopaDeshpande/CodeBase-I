package Practical;

public class Greatestof3 {

	public static void main(String[] args) {
		int x = 10, y = 60, z = 33;

		if (x > y && x > z) {
			System.out.println("X is greatest");
		} else if (y > x && y > z) {
			System.out.println("Y is greatest");
		} else {
			System.out.println("Z is greatest");
		}
	}
}
