package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		// List methods are synchronized
		namesList.add("Alex");
		namesList.add("Brian");
		namesList.add("Alex1");
		namesList.add("Brian1");
		namesList.add("Alex2");
		namesList.add("Brian2");
		namesList.add("Alex3");
		namesList.add("Brian3");
		// Use explicit synchronization while iterating
		synchronized (namesList) {
			Iterator<String> nit = namesList.iterator();
			while (nit.hasNext()) {
				System.out.println(nit.next());
			}
			}
			
			namesList.add("Brian4");
			synchronized (namesList) {
				Iterator<String> nit1 = namesList.iterator();
				while (nit1.hasNext()) {
					System.out.println(nit1.next());

				}


		}
	}
}