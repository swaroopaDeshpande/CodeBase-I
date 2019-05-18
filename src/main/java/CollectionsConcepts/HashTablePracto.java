package CollectionsConcepts;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablePracto {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(100, "Selenium");
		ht.put(200, "QTP");
		ht.put(300, "UFT");

		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
