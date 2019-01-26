package Practical;

public class LenofStringwithoutusinginbuiltFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India is awesome";
		System.out.println(str.length());

		int count =0;
		for(char c:str.toCharArray())
		{
			count++;
		}
		System.out.println("String's length is"+count); 
		

			

	}

}
