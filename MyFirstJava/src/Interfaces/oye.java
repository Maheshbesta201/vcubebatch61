package Interfaces;

public class oye implements hi,hello{
	byte b;
	short s;
	int i;
	long l;
	boolean bb;
	char c;
	double d;
	float f;

	public static void main(String[] args) {
		oye o =new oye();
		o.m1();
		System.out.println("default value of byte "+o.b);
		System.out.println("default value of short "+o.s);
		System.out.println("default value of int "+o.i);
		System.out.println("default value of long "+o.l);
		System.out.println("default value of boolean "+o.bb);
		System.out.println("default value of char "+o.c);
		System.out.println("default value of double "+o.d);
		System.out.println("default value of flaot "+o.f);

		
	}

	@Override
	public void m1() {
		System.out.println("who is this");
	}

}
