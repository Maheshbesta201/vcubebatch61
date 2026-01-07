package langfundamentals;

import java.util.Scanner;

public class Bank {
	
	static Scanner s=new Scanner(System.in);
	
	static String branch="Kurnool";
	static String ifsc="UBIN0803201";

	public static void main(String[] args) {
		Bank b=new Bank();
		int a=b.deposit();
		System.out.println("Account holder name : "+b.AccountHolderName());
		System.out.println("Account holder Accountnum : "+b.AccountNumber());
		System.out.println("Account holder deposit amount : "+a);
		System.out.println("Account holder Savings amount : "+b.savingsamount());
		System.out.println("total amount : "+(b.savingsamount()+a));

	}
	long AccountNumber() {
		long a=32010100249554l;
		return a;
	}
	String AccountHolderName() {
		String name="Mahesh";
		return name;
	}
	int deposit() {
		System.out.println(" Enter deposit amount ");
		int d=s.nextInt();
		return d;
	}
	int savingsamount() {
		int sa=12000;
		return sa;
	}

}
