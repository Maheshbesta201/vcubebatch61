package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface2 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(100);
		System.out.println(l);
		for(int i=0;i<=l.size();i++) { //100
			for(int j=i+1;j<l.size();j++) { //200 300 100
				if(l.get(i)==l.get(j)) {
					l.remove(j);
				}
			}
		}
		System.out.println(l);
	}

}
