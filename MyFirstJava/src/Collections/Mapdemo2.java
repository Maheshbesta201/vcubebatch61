//Frequency Counter 
//
//Given a list of words, use a Set and a Map together to print each unique word and its frequency.
//
// Approach :-
//
//Use a Map<String, Integer> (e.g., HashMap) to store word → frequency pairs.
//
//Use a Set<String> (e.g., HashSet) to store unique words.
//
//Iterate through the word list:
//
//If the word already exists in the map, increment its count.
//
//Otherwise, add it to the map with a count of 1 and to the set of unique words.
//
//Print all unique words and their frequencies.
//
//Input :-[ apple, banana, apple, orange ]
//
//Output:-
//
//Unique Words: [orange, banana, apple, grape]
//
//Word Frequencies:
//orange → 1
//banana → 2
//apple → 3
//grape → 1
package Collections;

import java.util.*;

public class Mapdemo2 {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "grape");
		Map<String,Integer> s=new HashMap<>();
		Set<String> s1=new HashSet<>();
		
		for(String word:words) {
			if(s.containsKey(word)) {
				s.put(word, s.get(word)+1);
			}else {
				s.put(word, 1);
				s1.add(word);
			}
		}
		System.out.println("unique words "+s);
		
		for(String word:s1) {
			System.out.println(word+"->"+s.get(word));
		}
	}

}
