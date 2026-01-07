package loopingstatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The factors of this number is : ");
		factor(a);
	}

	static void factor(int a) {
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
