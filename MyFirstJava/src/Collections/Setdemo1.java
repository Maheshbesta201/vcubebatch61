package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setdemo1 {

	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(100);
		s.add(50);
		s.add(151);
		s.add(566);
		s.add(20);
		System.out.println(s);

	}

}
