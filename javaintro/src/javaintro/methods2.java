package javaintro;

public class methods2 {
	static int s=0;
	
	static void m11() {
		System.out.println("1st Static method");
		m22();
		
	}
	
	static void m22() {
		System.out.println("2nd Static method");
	}
		
	
	void m33() {
		System.out.println("1st Instance method");
		
	}
	
	void m44() {
		System.out.println("2nd Instance method");
 		
	}
	public static void main(String[] args) {
		m11();
		System.out.println("main method");
		

	}
	static {
		methods2 m=new methods2();
		m.m33();
		m.m44();
	}

}
