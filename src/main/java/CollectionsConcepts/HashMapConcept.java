package CollectionsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements Map interface
		// extends AbstractMAP

		// 1.It contains only Unique element
		// 2.stores value in form of key and value format
		// 3.It may have one Null key and can have multiple null values
		// 4.It maintains no order.
		// 5.HashMap is non Synchronized: multiple threads can be access
		// one-concurrent modification exception /failed fast condition one
		// object accessing and
		// updating same object
		// 6.HashMap object Performance is good.

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Selenium");
		hm.put(20, "QTP");
		hm.put(30, "ALM");
		hm.put(40, "Jira");
		hm.put(null, "BugZilla");
		// hm.put(null, "TestNull");

		hm.put(50, "Cucumber");
		hm.put(70, null);
		hm.put(60, null);

		hm.put(50, null);

		System.out.println(hm.get(10));
		System.out.println(hm.get(60));// no insertion order maintain so no
										// indexoutOfBound Exception

		// get all values -->entry interface

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "" + m.getValue());
		}

		System.out.println(hm);
		hm.remove(30);
		System.out.println(hm);
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		Employee employee = new Employee("Tom", 25, "admin");
		Employee employee1 = new Employee("Jerry", 30, "Dev");
		Employee employee2 = new Employee("Buddy", 32, "QA");
		Employee employee3 = new Employee("Bro", 22, "Testing");

		hm1.put(100, employee);
		hm1.put(200, employee1);
		hm1.put(300, employee2);
		hm1.put(400, employee3);

		// traverse hashmap

		for (Entry<Integer, Employee> m : hm1.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + "employee Info");
			System.out.println(e.age);
			System.out.println(e.name);
			System.out.println(e.dept);
		}

	}

}
