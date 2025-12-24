package logicalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=sc.nextInt();
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		System.out.println("Select any one operation like  +,-,*,/,% ");
		String s=sc.next();
		switch(s) {
		case "+" ->System.out.println("The addition of a and b is : "+(a+b));
		case "-" ->System.out.println("The subtraction of a and b is : "+(a-b));
		case "*" ->System.out.println("The multipication of a and b is : "+(a*b));
		case "/" ->System.out.println("The division of a and b is : "+(a/b));
		case "%" ->System.out.println("The modulas of a and b is : "+(a%b));
		default ->System.out.println("enter valid operator");
		}
		
	}

}
