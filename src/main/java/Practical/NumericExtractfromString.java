package Practical;

public class NumericExtractfromString {

	public static void main(String[] args) {
		ExtractCharactersFromStr("Struggle12for5andind829");
		ExtractNumbersFromStr("Struggle12for5andind829");
		
	}

	public static void ExtractCharactersFromStr(String str) {
		str=str.replaceAll("[^A-Za-z]", "");
		System.out.println(str);
	}
	
	public static void ExtractNumbersFromStr(String str)
	{
		str=str.replaceAll("[^0-9]", "");
		System.out.println(str);
	}

}
