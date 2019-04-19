package JavaSessions;

public class StringConcepts {

	public static void main(String[] args) {
		// 1.String concatination "+": merge two things
		String str = "Hello";
		String str1 = "Swaroopa";
		System.out.println(str + str1);
		// *#*
		int a = 100;
		int b = 200;
		String x = "hello";
		String y = "World";

		System.out.println(a + b);
		// execution from left to right
		System.out.println(x + y);
		System.out.println(a + b + x + y);// 300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));

		// 2.Strings are immutable and final : Strings stored in String pool
		// 3.different ways to create String objects
		// 1.We can use double quotes like String str="Hello Swaroopa";stored in
		// string pool as whenever we create new obj it will check if obj with
		// same val already avlb then it will return sref of that same
		// obj,instead of creating new;
		// 2.using new keyword String str=new String("abc");--not store in
		// string pool
		// Benefits : 1.String pools only possible bcoz of its immutable
		// nature.Lots of heap memory saved as obj having same value stored in
		// same ref var
		// 2.Its final as bcoz of hacker can't change database value or
		// port,unm,pswd.
		// 3.Its usually safe to use in multithreading.we don't need
		// synchronization

		// 3 Difference between String buffer and String Builder
		// Java provides 2 classes for string Manipulation. Both are mutable
		// classes.
		// i.String buffer Thread safe and synchronized.String builder non
		// synchronized.

		// ii. Multiple envt we can use String Buffer.Where as single thread
		// envt we can use String builder
		// iii. String buffer –slow due to synchronization and String builder
		// fast

		// 4.String Manipulations

		String mystring1 = "The rains have started here selenium";// first index
																	// =0 n-1;0
		// to 25-26
		System.out.println("Length of mystring1 is " + mystring1.length());
		String s= "Scope of Automation is good now a days.Automation using selenium Automation is now having boom";
		System.out.println("Length of string s is"+s.length());
		System.out.println("Char at 2nd position in the string s is"+s.charAt(2));
		System.out.println("Index of string s is"+s.indexOf("Automation"));//9
		System.out.println("Second occurences of Automatomation is"+s.indexOf("Automation", s.indexOf("Automation")+1));
		System.out.println("Third occurences of Automatomation is"+s.indexOf("Automation", s.indexOf("Automation")+1)+s.indexOf("Automation"));

		
		
		// giving character represents that index position
		System.out.println(mystring1.charAt(26));
		// System.out.println(mystring1.charAt(27));//String index out of
		// bound
		// index of: giving index of that char
		System.out.println(mystring1.indexOf('a'));
		System.out.println(mystring1.indexOf('s'));// 1st occ of s
		System.out.println(mystring1.indexOf('s', 9));// 2nd occ of s

		System.out.println(mystring1.indexOf('s', mystring1.indexOf('s') + 1) + mystring1.indexOf('s'));// 2nd
		System.out.println(mystring1.indexOf('s', mystring1.indexOf('s', mystring1.indexOf('s') + 1) + 1));// 3rd
		System.out.println(mystring1.indexOf("Hello"));// -1

		// trim
		String s1 = "  Hello    World  ";
		s1 = s1.trim();
		System.out.println(s1);

		// replace
		String date = "24/10/85";
		date = date.replace('/', '-');
		System.out.println(date);

		// substring
		String s2 = "the rains started here";
		s2 = s2.substring(4, 9);
		System.out.println(s2);

		// split
		String s3 = "Hello_Selenium_Testing";
		String ch[] = s3.split("_");
		System.out.println(ch[0]);

	}

}
