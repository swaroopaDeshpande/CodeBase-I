package Practical;

import java.util.HashSet;

public class duplicateCharinString {

	public static void main(String[] args) {
	String s="swaroopa";
		
		char[] ch=s.toCharArray();
		
		HashSet<Character>hash=new HashSet<Character>();
		
		for(Character c: ch){
			if(hash.add(c)==false)
				System.out.println("Duplicates are:"+" "+c);
		}

	}


		}
		


	

	


