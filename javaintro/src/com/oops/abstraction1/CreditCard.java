package com.oops.abstraction1;

public class CreditCard implements Payment {

	@Override
	public void Pay(double amount) {
		System.out.println("amount debited from CreditCard");
	}

}
