package langfundamentals;

import java.util.Scanner;

public class ScannerDemo {
	static Scanner s=new Scanner(System.in);


	public static void main(String[] args) {
		System.out.println("Enter a value");
		int a1=s.nextInt();
		System.out.println("Enter b value");
		int b1=s.nextInt();
		add(a1, b1);

	}
	
	static void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition of these variables :"+c);
		System.out.println("Enter single value for Sub :");
		int c1=s.nextInt();
		sub(c,c1);
	}
	
	static void sub(int a,int c) {
		int d=c-a;
		System.out.println("Subtraction of these variables : "+d);
		System.out.println("Enter single value for mul :");
		int d1=s.nextInt();
		mul(d1,d);
	}
	static void mul(int a,int d) {
		int e=a*d;
		System.out.println("Multiplication of these variables :"+e);
		System.out.println("Enter single value for div :");

		int e1=s.nextInt();
		mod(e1,e);
	}
	static void mod(int a,int e) {
		int f=a%e;
		System.out.println("modulas of these variables :"+f);
		System.out.println("Enter single value for mod :");
		int f1=s.nextInt();
		div(f1,f);
	}
	static void div(int a,int f) {
		int g=a/f;
		System.out.println("div of these variables :"+g);
		
	}

}
