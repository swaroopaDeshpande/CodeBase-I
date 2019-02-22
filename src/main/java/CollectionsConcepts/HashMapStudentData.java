package CollectionsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

import org.jsoup.helper.HttpConnection.KeyVal;

public class HashMapStudentData {

	public static void main(String[] args) {

		HashMap<Integer, StudentObject> hm = new HashMap<Integer, StudentObject>();
		StudentObject student1 = new StudentObject(20, "Malhar", 78.80);
		StudentObject student2 = new StudentObject(19, "Mhalsaa", 80.80);
		StudentObject student3 = new StudentObject(20, "Banubai", 55.80);
		StudentObject student4 = new StudentObject(18, "Ganu", 90.80);

		hm.put(10, student1);
		hm.put(20, student2);
		hm.put(30, student3);
		hm.put(40, student4);

		for (Entry<Integer, StudentObject> stu : hm.entrySet()) {
			int keyValue = stu.getKey();
			StudentObject so = stu.getValue();
			System.out.println("Key value is " + keyValue);
			System.out.println(so.age);
			System.out.println(so.name);
			System.out.println(so.grades);
		}

	}

}
