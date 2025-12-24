package javalooping;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range : ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<n-1;i++) {
			int c=a+b; //1,1+1=2,1+2=3,2+3=5
			System.out.print(c+" ");
			a=b; //1,1,2
			b=c; //1,2,3
			
			
		}

	}

}
