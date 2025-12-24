//Write a Java program to return the first non-repeating character
//using LinkedHashMap.
//
//Input: "swiss"
//Output: 'w'
package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ListDemo1 {

	public static void main(String[] args) {
		String s="swiss";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
			
		}
        Set<Entry<Character, Integer>> entrySet = map.entrySet();
        for(Entry<Character, Integer> entry:entrySet) {
        		if(entry.getValue()==1) {
        			System.out.println(entry.getKey()+"->"+entry.getValue());
        			break;
        		}
        }
	}

}
