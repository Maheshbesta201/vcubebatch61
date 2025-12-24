package Java8feautures;

import java.util.function.Consumer;
import java.util.function.BiConsumer;


public class TestDemo3 {

	public static void main(String[] args) {
		Consumer<String> s=(s1)->System.out.println(s1.length());
		s.accept("Mahesh");
		
		BiConsumer<String,String> s2=(s3,s4)->System.out.println(s3.concat(s4));
		s2.accept("Mahesh","Besta");
		
	}

}
