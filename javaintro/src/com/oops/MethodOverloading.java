package com.oops;

public class MethodOverloading {
	
	void hello(int a,int b) {
		System.out.println("product of two integers : "+(a*b));
	}
	void hello(double a,double b) {
		System.out.println("product of two decimals : "+(a*b));
	}
	void hello(String a,String b) {
		System.out.println("concatination of two Strings : "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.hello(10, 20);
		m.hello(10.5, 19.5);
		m.hello("Mahesh","Babu");
	}

}
