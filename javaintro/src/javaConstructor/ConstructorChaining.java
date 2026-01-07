package javaConstructor;

class A{
	public A() {
		System.out.println("Parent No arg");
	}
	public A(int a){
		super();
		System.out.println("Parent one arg");
	}
}
class B extends A{
	public B() {
		this("hello");
		System.out.println("Child No arg");
	}
	 B(String s){
		System.out.println("Child one arg");
	}
}


public class ConstructorChaining {
	
//	int id;
//	
//	public ConstructorChaining() {
//		this(10);
//		System.out.println("No arg");
//	}
//	
//	public ConstructorChaining(int a) {
//		this(a,"mahesh");
//		System.out.println(a+" one arg");
//	}
//	
//	public ConstructorChaining(int a,String s){
//		
//		System.out.println(a+ " "+s+ " two arg");
//	}

	public static void main(String[] args) {
		//ConstructorChaining c=new ConstructorChaining();
		
		B b=new B();

	}

}
