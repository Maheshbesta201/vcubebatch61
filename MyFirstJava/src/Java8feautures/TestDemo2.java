//predicate  it returns only boolean values
//biPredicate it returns only boolean values

package Java8feautures;

import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class TestDemo2 {

	public static void main(String[] args) {
		Predicate<Integer> p=(s)-> s%2==0;
		System.out.println(p.test(20));
		
		BiPredicate<Integer,Integer> bp= (a,b)->a%b==0;
		System.out.println(bp.test(10, 30));
		
	}

}
