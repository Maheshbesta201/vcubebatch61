package Collections;

import java.util.*;
import java.util.Map.Entry;
public class Mapdemo1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(201, "Mahesh");
		m.put(202, "Hari");
		m.put(203, "chaitan");
		m.put(204, "shiva");
		m.put(205, "anand");
		//System.out.println(m);
		
        Set<Entry<Integer, String>> entrySet = m.entrySet();
        for(Entry<Integer, String> entry:entrySet) {
        	System.out.println(entry);
        }
	}

}




class a{
	void method1() {
		System.out.println("parent");
	}
	
}
class b extends a{
	void method1() {
		System.out.println("child");
	}
	void method2() {
		System.out.println("child");
	}
	
}
class c{
	public static void main(String[] args) {
		a b=new a();
		a a=new b();
		b.method1();
		a.method1();
	}
}
