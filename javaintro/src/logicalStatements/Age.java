package logicalStatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of the person :");
		int age=sc.nextInt();
		if (age>0 && age<=6) {
			System.out.println("The mentioned age is kids");
		}
		else if (age>6 && age<=12) {
			System.out.println("The mentioned age is children");
		}
		else if (age>12 && age<=19) {
			System.out.println("The mentioned age is teenagers");
		}
		else if (age>19 && age<=35) {
			System.out.println("The mentioned age is young age");
		}
		else if (age>35 && age<=60) {
			System.out.println("The mentioned age is Middle age");
		}
		else {
			System.out.println("The mentioned age is oldage");
		}
		
		
	}

}
