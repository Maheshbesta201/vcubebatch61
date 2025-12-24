package javalooping;

public class Print1to100 {
	static int i=1;
	public static void main(String[] args) {
		method();
	}

	 static void method() {
		 System.out.print(i+" ");
		 if(i<10) {
			 method1();
		 }
	}
	 static void method1() {
		 i++;
		 method();
	 }

}
