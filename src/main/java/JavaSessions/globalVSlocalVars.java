package JavaSessions;

public class GlobalVsLocalVars {
	// global vars: scope through out class
	// if you want to access global vars access it via obj ref name
	int age;
	String name;

	public static void main(String[] args) {

		int j = 100;// local vars scope is limited to
		System.out.println(j);
		GlobalVsLocalVars obj = new GlobalVsLocalVars();
		obj.sum(10);
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}

	public void sum(int i) {
		System.out.println(i);
	}

}
