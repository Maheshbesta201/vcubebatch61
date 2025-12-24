//Write a Java program to sort a Map<String, Integer> by values in
//descending order.
//
//Input: {a=5, b=1, c=3}
//Output: {a=5, c=3, b=1}
package Collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Mapdemo4 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		map.put('a', 5);
		map.put('b', 1);
		map.put('c', 3);
		List<Map.Entry<Character, Integer>> ll = new ArrayList<>(map.entrySet());
		ll.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		Map<Character, Integer> map1 = new LinkedHashMap<>();

		for (Map.Entry<Character, Integer> entry : ll) {
			map1.put(entry.getKey(), entry.getValue());
		}
		System.out.println("sorted map:" + map1);
	}

}
