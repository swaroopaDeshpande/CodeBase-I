package OOPS;

public class EncpasulationConepts {
	// Its a mechanisum to wrapping data members(instance Vars) and code to
	// perform actions on those vars together in single unit
	// whole mechanisum is hiding implementation details from users
	// real life :in bank acount details kept in objcet called account
	// advt:Reusability of code
	// code maintainance
	// flixible
	// private data variables
	// instance vars pvt so cannot be access outside class directly
	private int ssn;
	private String name;
	private int empAge;

	// getter setter to get and set val of pvt members
	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public static void main(String[] args) {

		EncpasulationConepts emp = new EncpasulationConepts();
		emp.setSsn(100);
		System.out.println(emp.getSsn());
		emp.setEmpAge(25);
		System.out.println(emp.getEmpAge());
		emp.setName("Tom");
		System.out.println(emp.getName());
	}
}
