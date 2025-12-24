package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections3 {

	public static void main(String[] args) {
		Collection<String> Names = new ArrayList<>();
		Names.add("anand");
		Names.add("shiva");
		Names.add("charan");
		Names.add("chaitan");
		System.out.println(Names);
		System.out.println(Names.contains("charan"));
		Collection<String> Names1 = new ArrayList<>();
		Names1.addAll(Names);
		System.out.println(Names1.containsAll(Names));
		Names.removeAll(Names);
		System.out.println(Names1.containsAll(Names));
		System.out.println(Names);

	}

}
