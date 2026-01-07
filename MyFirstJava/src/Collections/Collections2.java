package Collections;

import java.util.*;

public class Collections2 {

	public static void main(String[] args) {
		Collection<String> ele = new ArrayList<>();
		ele.add("vivo");
		ele.add("oppo");
		ele.add("iqoo");
		ele.add("iphone");
		System.out.println(ele);
		
		Collection<String> ele1 = new ArrayList<>();
		ele1.add("camera");
		ele1.add("processor");
		ele1.add("music");
		ele1.add("security");
		System.out.println(ele1);
		
		Collection<String> Tele = new ArrayList<>();
		Tele.addAll(ele);
		Tele.addAll(ele1);
		System.out.println(Tele);

	}

}
