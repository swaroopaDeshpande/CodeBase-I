package Practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class repetativeWords {

	public static void main(String[] args) {
		// method1 using for loops
//		String str = "this is frustratig weekend";
//		str = str.toLowerCase();
//		String words[] = str.split("");
//		System.out.println("Duplicate words in a given string : ");
//		for (int i = 0; i < words.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < words.length; j++) {
//				if (words[i].equals(words[j])) {
//					count++;
//					words[j] = "0";
//				}
//			}
//			// Displays the duplicate word if count is greater than 1
//			if (count > 1 && words[i] != "0")
//				System.out.println(words[i]);
//		}
//
//		// 2.Using HashMap
//		Map<String, Integer> occurrences = new HashMap<String, Integer>();
//		for (String word : words) {
//			Integer oldCount = occurrences.get(word);
//			if (oldCount == null) {
//				oldCount = 0;
//			}
//			occurrences.put(word, oldCount + 1);
//
//		}
//		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		String text = "a r b k c d se f g a d ft s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";

		List<String> list = Arrays.asList(text.split(" "));

		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(list, word));
		}

	}

}
