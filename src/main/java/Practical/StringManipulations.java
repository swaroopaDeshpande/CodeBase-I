package Practical;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "TestCase.LoginVerify().class=main.login";

		String[] str1 = str.split("\\.");
		for (String st : str1) {
			if (st.contains("LoginVerify()")) {
				System.out.println(st);
			}
		}

	}

}
