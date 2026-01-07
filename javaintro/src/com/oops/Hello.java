package com.oops;

public class Hello {
	String name="mahesh";
	private int x=10;
	int Getx() {
		return x;
	}
	void disp() {
		System.out.println("iam from parent");
	}
}
class hi extends Hello{
	public static void main(String[] args) {
		Hello h = new Hello();
		Hello h1=new hi();
		System.out.println(h.Getx());
		System.out.println(h.name);
		h1.disp();
	}
	void disp() {
		System.out.println("iam from child");
	}
}
