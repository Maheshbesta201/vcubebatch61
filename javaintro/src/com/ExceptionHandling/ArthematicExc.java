package com.ExceptionHandling;

//Create a program that tries to access an Arthimatic Exception and handle the exception.


import java.util.Scanner;

public class ArthematicExc {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		
		try {
			System.out.println("division of two numbers : "+(a/b));
		}catch(Exception e){
			System.err.println("number cannot divided by zero");
		}
		System.out.println("Main method Ended");
		sc.close();

	}

}
