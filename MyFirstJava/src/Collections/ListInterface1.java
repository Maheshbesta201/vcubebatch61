package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface1 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(100);
		l.add(150);
		l.add(10);
		l.add(105);
		l.add(126);
		l.add(182);
		l.add(144);
		l.add(111);
		System.out.println("normal method");
		System.out.println(l);
		
		System.out.println("Using ForEach method");
		for(Integer i:l) {
			System.out.print(i+" ");
		}
		System.out.println();
		
        System.out.println("Using for loop");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Using Iterator Method");
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
