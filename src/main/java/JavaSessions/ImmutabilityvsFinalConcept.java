package JavaSessions;

public class ImmutabilityvsFinalConcept {

	public static void main(String[] args) {
		// we cannot achieve immutability via declaring reference variable as
		// final
		// final and immutabilty is diff
		// immutability related to object and final related to reference
		// variable
		// then what's the usability of this final
		// if you declare reference variable as final then u can't reassign that
		// reference var to new object
		// you can perform changes in current object but you can't reassign this
		// reference varibale to new object

		final StringBuffer sb = new StringBuffer("Swaroopa");
		sb.append("Software");
		System.out.println(sb);
		//Compile time error sb=new StringBuffer("Test");
		
		//meaingful?
		//final varible--true
		//final object--false
		//immutable variable--false
		//immutable object--true
		
		
	}

}
