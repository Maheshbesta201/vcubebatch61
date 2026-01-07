package com.oops.abstraction;

public class SavingsAccount extends Bank{

	@Override
	double CalculateIntrest() {
		balance =balance+(balance*10)/100;
		System.out.println("saings account Intrest : "+balance);
		return balance;

	}
	 void Deposit(double Deposit) {
		balance=Deposit;
		System.out.println("Amount Deposited SavingsAccount : "+ balance);
	}
	 void withdraw(double Withdraw) {
		balance=balance-Withdraw;
		System.out.println("Amount Withdraw SavingsAccount : "+ balance);

	}

}
