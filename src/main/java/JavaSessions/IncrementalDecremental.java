package JavaSessions;

public class IncrementalDecremental {

	public static void main(String[] args) {

		int i = 1;
		int j = i++;
		System.out.println(i);// 2
		System.out.println(j);// 1

		int i1 = 1;
		int j1 = ++i1;

		System.out.println(i1);// 2
		System.out.println(j1);// 2

		int i2 = 1;
		int j2 = i2--;

		System.out.println(i2);// 0
		System.out.println(j2);// 1

		int i3 = 1;
		int j3 = --i3;
		System.out.println(i3);//0
		System.out.println(j3);//0

	}

}
