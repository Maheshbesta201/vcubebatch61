package com.oops.abstraction;

public class CurrentAccount extends Bank{

	@Override
	double CalculateIntrest() {
		balance =balance+(balance*5)/100;
		System.out.println("Current account Intrest : "+balance);
		return balance;
		
	}
	 void Deposit(double Deposit) {
		balance=Deposit;
		System.out.println("Amount Deposited Current account : "+ balance);
	}
	 void withdraw(double Withdraw) {
		balance=balance-Withdraw;
		System.out.println("Amount Withdraw Current Account : "+ balance);

	}

}
