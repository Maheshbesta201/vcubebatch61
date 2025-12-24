package javaintro;

public class methods {
	

	void m1() {
		System.out.println("1st Instance method");
		m2();
	}
	
	void m2() {
		System.out.println("2nd Instance method");
		m3();
		
	}
	
	static void m3() {
		System.out.println("1st Static method");
		m4();
	}
	
	static void m4() {
		System.out.println("2nd Static method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		methods m=new methods();
		m.m1();
	}

}
