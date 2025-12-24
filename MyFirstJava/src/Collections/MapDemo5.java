package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {

	public static void main(String[] args) {
		System.out.println("hello ");
		HashMap<String,Integer> stu=new HashMap<>();
		stu.put("chaitan", 200);
		stu.put("shiva", null);
		stu.put("hari", 205);
		stu.put("chaitan", 203);
		stu.put("mahesh", null);
		stu.put(null, 209);
		stu.put(null, 222);


		System.out.println(stu);
		
		Set<Map.Entry<String, Integer>> map=stu.entrySet();
		for(Map.Entry<String, Integer> map1:map) {
			System.out.println(map1.getKey()+"-->"+map1.getValue());
			
		}
		
	}

}
