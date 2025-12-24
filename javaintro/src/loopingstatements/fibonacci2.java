package loopingstatements;

import java.util.Scanner;

public class fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<n-1;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
