package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections1 {

	public static void main(String[] args) {
		//Creation of a Collection or ArrayList
		Collection<Object> c=new ArrayList<>();
		//Adding elements in a collection
		c.add("Mahesh");
		c.add("hari");
		c.add('h');
		c.add(201);
		c.add(90.5F);
		c.add(93.3);
		//Representation of elements in a collection
		System.out.println(c);
		System.out.println("**********************");
		for(Object a:c) {
			System.out.println(a);
		}
	}
	
	

}
