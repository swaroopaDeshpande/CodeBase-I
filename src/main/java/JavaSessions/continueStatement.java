package JavaSessions;

public class ContinueStatement {

	public static void main(String[] args) {
		// continue :jumps to the next iteration
		
		 int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }

	}

}
