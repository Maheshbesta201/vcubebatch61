package com.ExceptionHandling;

public class InvalidAmountException extends Exception {
	public InvalidAmountException(String s) {
		super(s);
	}
}
class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
