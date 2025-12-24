package com.oops.abstraction;

public class BankOperations {

	public static void main(String[] args) {
		Bank s = new SavingsAccount();
		Bank c=new CurrentAccount();
		s.Deposit(1000);
		c.Deposit(1000);
		c.withdraw(1000);
		s.CalculateIntrest();   
		c.CalculateIntrest();
		}

}
