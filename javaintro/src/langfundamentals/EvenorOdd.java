package langfundamentals;

import java.util.Scanner;

public class EvenorOdd {
	
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		EvenorOdd e=new EvenorOdd();
		int n=s.nextInt();
		boolean b=e.EvenOdd(n);
		System.out.println("Is this number even..?  "+b);
		
	}
	boolean EvenOdd(int num) {
		boolean status=false;
		if(num%2==0) {
			status=true;
		}
		return status;
	}

}
