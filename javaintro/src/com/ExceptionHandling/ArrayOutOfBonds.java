package com.ExceptionHandling;

//Create a program that tries to access an array element out of bounds and handle the exception.


public class ArrayOutOfBonds {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] a = { 4, 2, 7, 2, 9, 4, 7, 3,7 };
		try {
			for (int i = 0; i <=a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println();
			ae.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
