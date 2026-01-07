package com.ExceptionHandling;

public class Account {
	int AccNo;
	String Name;
	double Balance;
	
	Account(int Accno,String name,double Balance){
		this.AccNo=Accno;
		this.Name=name;
		this.Balance=Balance;
	}
	
	double deposit(Double amount) throws Exception {
		if(amount<=0) {
			throw new InvalidAmountException("Deposit Amount must be Grater than 0");
		}
		Balance=Balance+amount;
		System.out.println("Amount Deposited : "+amount);
		return Balance;	
	}
	double Withdraw(Double amount) throws Exception {
		if(amount>=Balance) {
			throw new InsufficientBalanceException("Insufficient balance ");
		}
		Balance=Balance-amount;
		System.out.println("Amount Withdraw : "+amount);
		System.out.println("Remainig Balance : "+Balance);
		return Balance;	
	}
}
