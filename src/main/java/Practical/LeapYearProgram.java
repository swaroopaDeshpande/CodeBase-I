package Practical;

public class LeapYearProgram {

	public static void main(String[] args) {

		leapyear(1804);
		leapyear(2240);
	}

	public static void leapyear(int year) {

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("it's a leap year");
		} else
			System.out.println("not aleap year");
	}

}
