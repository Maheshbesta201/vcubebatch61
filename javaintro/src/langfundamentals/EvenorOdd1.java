package langfundamentals;

import java.util.Scanner;

public class EvenorOdd1 {
	
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		EvenorOdd1 e=new EvenorOdd1();
		int n=s.nextInt();
		int b=e.EvenOdd(n);
		if(b==0) {
			System.out.println("The Given Number is Odd number");
		}
		else {
			System.out.println("The Given Number is Even Number");
		}
		
	}
	int EvenOdd(int num) {
		int count =0;
		if(num%2==0) {
			count++;
		}
		return count;
	}

}
