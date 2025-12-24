package langfundamentals;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Details please ");
		System.out.println("enter Your Name : ");
		String s1=s.next();
		System.out.println("Enter your age : ");
		int i=s.nextInt();
		System.out.println("Enter your Gender : ");
		char ch=s.next().charAt(0);
		System.out.println("enter Your city : ");
		String c=s.next();
		
		System.out.println("Employee Name : "+s1);
		System.out.println("Employee age : "+i);
		System.out.println("Employee gender : "+ch);
		System.out.println("Employee city : "+c);


	}

}
