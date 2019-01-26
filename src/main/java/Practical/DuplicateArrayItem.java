package Practical;

import java.util.HashSet;

public class DuplicateArrayItem {

	public static void main(String[] args) {
		
		int arr[]={10,20,10,30,40};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(Integer i:arr)
		{
			if(hs.add(i)==false)
			{
				System.out.println("Duplicate number in array "+i);
			}
		}
	}

}
