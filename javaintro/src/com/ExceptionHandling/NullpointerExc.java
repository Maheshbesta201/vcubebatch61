package com.ExceptionHandling;

public class NullpointerExc {

	public static void main(String[] args) {
		System.out.println("main method Started");
		try {
			System.out.println(m1().length());
		}catch(NullPointerException n) {
			n.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		System.out.println("main method ended");
		
	}
	static String m1() {
		String s=null;
		return s;
	}

}
