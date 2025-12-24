package com.ExceptionHandling;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Account a =new Account(032010100,"Mahesh",1000);
		System.out.println("customer Name :"+a.Name);
		System.out.println("customer Account Number :"+a.AccNo);
		System.out.println("Enter Deposit Amount");
		try {
			double b=sc.nextDouble();
			a.deposit(b);
		}catch(InvalidAmountException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Total balance in your account : "+a.Balance);
		}
		System.out.println("Do you Want to withdraw your amount : ");
		System.out.println("please select yes or no");
		String s1=sc.next();
		if(s1.equalsIgnoreCase("yes")) {
			System.out.println("Enter Withdraw Amount");
			try {
				double b=sc.nextDouble();
				a.Withdraw(b);
			}catch(InsufficientBalanceException e){
				e.printStackTrace();
			}
			finally {
				System.out.println("Total balance in your account : "+a.Balance);
			}
		}
		System.out.println("Transaction Completed ");
		sc.close();
	}

}
