package Practical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatedNum2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 9, 3, 4, 3, 3, 1, 2, 4, 5, 3, 8, 3, 9, 0, 3, 2 };
		int maxKey = -1;
		int maxValue = -1;

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!hash.containsKey(arr[i])) {
				hash.put(arr[i], 1);
			}
			hash.put(arr[i], hash.get(arr[i]) + 1);
		}

		Set<Entry<Integer, Integer>> s1 = hash.entrySet();
		Iterator<Entry<Integer, Integer>> i1 = s1.iterator();

		while (i1.hasNext()) {
			Entry<Integer, Integer> entry = i1.next();
			if (entry.getValue() > maxValue) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			}
		}

		System.out.println("The winner is number " + maxKey + " its frequency of occurrence is " + maxValue);

	}

}
