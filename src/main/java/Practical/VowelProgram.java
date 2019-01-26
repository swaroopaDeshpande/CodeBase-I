package Practical;

public class VowelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Swaroopa";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'u') {
				counter = counter + 1;
			}
		}

		System.out.println(counter);

	}

}
