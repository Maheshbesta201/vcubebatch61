package javalooping;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		if(n==1) {
			System.out.println(a);
		}else {
			for(int i=1;i<n;i++) {
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println(a);
		}
		
	}

}
