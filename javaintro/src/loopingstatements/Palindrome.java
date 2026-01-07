package loopingstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter number : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//123
		boolean b=palindrome(a);
		if(b) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
	static boolean palindrome(int n) {
		boolean status=false;
		int a=n;
		int sum=0;
		int r=0;
		while(n!=0) {
			r=n%10;  //123%10 -->3,12%10--> 2
			sum =sum*10+r;//0=0*10+3-->3,3=3*10+2 --> 32
			n=n/10; // 123/10 -->12 
			
		}
		if(sum==a) {
			status =true;
		}
		
		return status;
	}

}
