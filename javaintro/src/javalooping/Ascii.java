package javalooping;

class Ascii {
	public static void main(String[] args) {
		int a = 'a' / 'a';
		m1(a);
	}
	static void m1(int a) {
		int b = 'd';
		if (a <= b) {
			System.out.print(a + " ");
			m2(a);
		}
		
	}
	static void m2(int c) {
		c++;
		m1(c);
	}
}
