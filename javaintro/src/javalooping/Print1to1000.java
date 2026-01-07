package javalooping;

public class Print1to1000 {
	static char a1='a';
	static char a2='b';
	static char a3='d';
	static int a=(int)a2-(int)a1;
	static int n=(int)a3;
	public static void main(String[] args) {
		method1(a);
	}

	static void method1(int a) {
		System.out.print(a+" ");
		if(a<n) {
			method2();
		}
	}

	static void method2() {
		a++;
		method1(a);
	}
	

}
