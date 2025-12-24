package Practice;

import java.util.Stack;

public class Vectorclass {

	public static void main(String[] args) {
		Stack<Integer> list=new Stack<>();
		System.out.println(list.empty());
		list.add(10);
		list.push(5);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.empty());
		System.out.println(list.pop());
		System.out.println(list.peek());
		
		
		System.out.println(list);

		
		
	}

}
