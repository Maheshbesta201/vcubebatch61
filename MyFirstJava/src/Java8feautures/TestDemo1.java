//Function 
//BI-Function

package Java8feautures;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestDemo1 {

	public static void main(String[] args) {
		Function<Integer,Boolean> f=(s)-> s%2==0;
		System.out.println(f.apply(4));
		
		BiFunction<Integer,Integer,Integer> bf= (a,b)->a+b;
		System.out.println(bf.apply(10,20));
		
	}

}
