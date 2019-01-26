package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;


public class DynamicArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add('F');
		ar.add("Swar");
		ar.add(10.20);
		
		for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		Emp obj=new Emp(25,"Swaroopa");
		ArrayList<Emp> Employee=new ArrayList<Emp>();
		Employee.add(obj);
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		//Generics :
		
		// Properties of arrayList
				// 1.Can store duplicate values
				// 2.it maintain Insertion order
				// 3.Synchronized(Thread safe)--Slow
				// 4.Random access to elements : as store value on index basis

				// How to use arraylist for user defined class objects
				// 1.Create class level vars
				// 2.Create Employee class with its constructor
				// 3.ArrayList create of type employee
				// 4.Create object of employee(User defined class)
				// 5.give that ref to arraylist and add
				// 6.Retrieve valued via Iterator=>We have Iterator Method in
				// arrayList(HasNext(),isNext())
		Iterator<Emp> it = Employee.iterator();
		while (it.hasNext()) {
			Emp employee = it.next();
			System.out.println(employee.name);
			System.out.println(employee.age);
		}

	}
}
