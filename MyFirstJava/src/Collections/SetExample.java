//1.Merge two sets 
//
//    Task:- create two sets of students names merge them into a single set.
//
//Output:- print the merged set of names with remove duplicate names in case they
//have case sensitive duplicates remove that one also..( 'Java' and 'java' are considered duplicates).
package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> s1=new TreeSet<>(); 
		s1.add("hari");
		s1.add("Anand");
		s1.add("Shiva");
		s1.add("Chaitan");
		for(int i=0;i<=s1.size();i++) {
			System.out.println();
		}
		
		
		Set<String> s2=new TreeSet<>(); 
		s2.add("Eshwar");
		s2.add("Bharath");
		s2.add("Anil");
		s2.add("Adithya");
		System.out.println(s2);
	}

}
