package com.ExceptionHandling;

import java.util.Scanner;

public class InvalidAge {

	public static void main(String[] args) throws InvalidAgeException{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int a=sc.nextInt();
		if(a>18) {
			System.out.println("Your Eligible for vote");
		}else {
			throw new InvalidAgeException("your Age is less than 18 not eligible for vote");
		}
		sc.close();
		
	}

}
