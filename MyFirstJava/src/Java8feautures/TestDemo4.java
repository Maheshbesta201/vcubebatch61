package Java8feautures;

import java.util.Random;
import java.util.function.Supplier;

public class TestDemo4 {

	public static void main(String[] args) {
		Supplier<String> s=()->"Hello Supplier";
		System.out.println(s.get());
		
		Supplier<Integer> s1=()->new Random().nextInt(100000);
		System.out.println(s1.get());
		
		
	}

}
