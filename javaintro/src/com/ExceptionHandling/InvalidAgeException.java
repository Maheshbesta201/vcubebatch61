package com.ExceptionHandling;

//Create a program in Java that throws a custom exception called InvalidAgeException
//if the user enters an age less than 18. Otherwise, print "Valid Age - You can Vote!".


public class InvalidAgeException extends Exception {
	
	InvalidAgeException(String s){
		super(s);
	}
	
}
