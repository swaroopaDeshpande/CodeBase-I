package JavaSessions;

public class ExceptionsConcept {

	int i = 10;

	public static void main(String[] args) {
		// //uncought exception
		// int i=9/0;
		// System.out.println(i);
		//
		// //cought exception:Unhandled exception type InterruptedException
		// Thread.sleep(2000);

		// null ref
		ExceptionsConcept obj = new ExceptionsConcept();
		obj = null;
		System.out.println(obj);
		System.out.println(obj.i);

		// 1.try catch block
	}
}

