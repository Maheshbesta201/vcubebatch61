package Collections;

import java.util.ArrayList;
import java.util.List;

public class collection2 {

	public static void main(String[] args) {
		Collection1 cc=new Collection1(201, "mahesh", "EEE");
		Collection1 c1=new Collection1(202, "vasanth", "EEE");
		Collection1 c2=new Collection1(203, "sai", "EEE");
		Collection1 c3=new Collection1(204, "rajesh", "EEE");
		Collection1 c4=new Collection1(205, "chaitan", "EEE");
		Collection1 c5=new Collection1(206, "shiva", "EEE");

		List<Collection1> Student=new ArrayList<>();
		Student.add(cc);
		Student.add(c1);
		Student.add(c2);
		Student.add(c3);
		Student.add(c4);
		Student.add(c5);
//		System.out.println(Student);
		for(Collection1 c:Student) {
			System.out.println(c);
		}
	}

}
