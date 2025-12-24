package Patterns;

public class Constructors {
	
	 private Constructors() {
		System.out.println("no arg");
	}
	 protected Constructors(int a) {
		System.out.println("one arg");
		
	}
	 Constructors(int a,int b) {
		System.out.println("two arg");
		
	}
	

	public static void main(String[] args) {
		new Constructors(10,20);
		new Constructors();
		new Constructors(10);

	}
	

}
