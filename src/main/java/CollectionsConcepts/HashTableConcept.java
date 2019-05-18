package CollectionsConcepts;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// it is similar to hashmap but it is synchronized
		// stores value on the basis of key and value
		// Key-->stored as Object-->each object has unique HashCode-->Value
		// key has unique hashcode value
		// Hashtable stored key --basis of HashCode
		// <1458522,"Tom">
		// it contains unique values
		// it cannot have null key and value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Jerry");

		// Shallow copy ,clone

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();

		System.out.println(h1);
		System.out.println(h2);

		h1.clear();

		System.out.println(h1);
		System.out.println(h2);

		// contains value
		Hashtable st = new Hashtable();
		st.put('a', "Swar");
		st.put('b', "SDET Mgr");
		st.put('c', "Selenium");
		if (st.containsValue("Swar"))
			System.out.println("value is found");

		// print all values from HashTable : Enumeration--elements() method

		Enumeration e = st.elements();
		System.out.println("Print values of st");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// entryset()

		Set s = st.entrySet();
		System.out.println(s);

	}

}
