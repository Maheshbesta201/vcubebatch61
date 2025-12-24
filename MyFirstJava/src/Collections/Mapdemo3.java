//Write the java code for group the anagrams in given Array using Set and Map.
//    a) set for unique words 
//    b) Map for store the word and anagrams list
//
//Input :- { "eat", "tea", "tea", "tan", "ate", "nat", "bat", "ate" }
//
//output :- 
//Unique words : ["eat", "tea", "tan", "ate", "nat", "bat"]
//
//Anagrams : [ eat= ["eat", "tea", "ate"] , tan=["tan", "nat"] , bat= ["bat"] ]

package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mapdemo3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> words = Arrays.asList("eat", "tea", "tea", "tan", "ate", "nat", "bat", "ate");
		Map<String, List<String>> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		for (String word : words) {
			set.add(word);
		}
		for (String word : words) {

		}
		System.out.println("Unique Words : " + set);
	}

}
