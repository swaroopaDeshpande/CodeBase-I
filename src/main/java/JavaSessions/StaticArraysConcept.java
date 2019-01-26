package JavaSessions;

public class StaticArraysConcept {

	public static void main(String[] args) {
		// Array: Store multiple values of similar datatypes in single vars
		// Static array: 1.Can store primitive data types as well as objects
		// 2.Size is fixed.Memory allocation is biggest problem
		// 3.for length use arrvar.length;array[3] 0-lowst index-2 highest
		// index,3 is size
		// ArrayIndexOutOfBoundsException: when we try to access value which is
		// beyond size of array

		// object array -Object is class in java
		// can able to store different data types
		int i[] = { 10, 20, 30, 40 };
		int j[] = new int[3];
		int S[] = new int[4];
		S[0]=10;
		S[1]=20;
		S[2]=30;
		S[3]=40;
		
		double d[]=new double[2];
		d[0]=10.55;
		d[1]=11.36;
		
		System.out.println(d[1]);
		
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(S[4]);
		System.out.println(S.length);
		// System.out.println(i[5]);
		System.out.println(i.length);//size of array
		System.out.println(j[2]);// 0
		// able to store different data types
		//Object is a class in java
		Object obj[] = new Object[4];
		obj[0] = "tom";
		obj[1] = 'M';
		obj[2] = 1000;
		obj[3] = 12.22;
		
		for(int k=0;k<=obj.length-1;k++)
		{
			System.out.println(obj[k]);
		}
		
		
		
		
		
		
		

	}

}
