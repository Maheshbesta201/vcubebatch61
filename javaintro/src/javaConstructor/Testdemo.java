package javaConstructor;

public class Testdemo {
	int i=10;
	String s;
	public Testdemo(String s) {
		this.s=s;
	}
	public Testdemo() {
	}
	
	public static void main(String[] args) {
		Testdemo t=new Testdemo("hello");
		Testdemo t1=new Testdemo();
		System.out.println(t1.s);
	}

}
