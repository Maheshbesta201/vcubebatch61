package logicalStatements;

import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	static double balance = 1000;
	static int pin = 1234;

	void deposit() {
		System.out.println("enter deposit amount : ");
		double d = sc.nextDouble();
		double h = balance + d;
		System.out.println("updated balance : " + h);
	}

	void withdraw() {
		System.out.println("enter withdraw amount : ");
		double d = sc.nextDouble();
		if(d<=balance) {
			double h = balance - d;
			System.out.println("updated balance : " + h);
		}
		else {
			System.out.println("insufficient balance in your account ");
		}
	}

	void pinchange() {
		System.out.println("enter your old pin");
		int pin1 = sc.nextInt();
		if (pin == pin1) {
			System.out.println("enter your new pin");
			int pin2 = sc.nextInt();
			if (pin2 != pin) {
				pin = pin2;
				System.out.println("pin succesfully changed");
			} else {
				System.out.println("new pin and old pin not same");
			}

		} else {
			System.out.println("enter correct pin ");
		}
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		
		System.out.println("present balance in your account : " + balance);
		System.out.println("Deposit");
		System.out.println("Withdraw");
		System.out.println("PIN Change");
		System.out.println("select any one operation : ");
		String s=sc.next();
		if (s.equalsIgnoreCase("deposit")) {
			a.deposit();
		}
		else if (s.equalsIgnoreCase("withdraw")) {
			a.withdraw();
		}
		else if(s.equalsIgnoreCase("pinchange")) {
			a.pinchange();

		}
		else {
			System.out.println("enter correct input");
		}

	}
}
