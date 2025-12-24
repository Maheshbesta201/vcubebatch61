package com.oops.abstraction1;

import java.util.Scanner;

public class PaymentPage {

	public static void main(String[] args) {
		Payment u=new Upi();
		Payment c=new CreditCard();
		Payment p=new Paypal();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select any one Option : ");
		System.out.println("1.Credit card ");
		System.out.println("2.Upi");
		System.out.println("3.Paypal");
		int a=sc.nextInt();
		switch(a){
			case 1:
				c.Pay(500);
				break;
			case 2:
				u.Pay(500);
				break;
			case 3:
				p.Pay(500);
				break;
			default:
				System.out.println("Enter Correct input");
		}		
	}

}
