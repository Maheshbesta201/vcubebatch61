package javalooping;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		isarmstrong(a);
	}

	 static void isarmstrong(int a) {
		 String s=Integer.toString(a);
		 int count=s.length();
		 int temp=a;
		 int sum=0;
		 while(a!=0) {
			 int r=a%10;
			 sum=sum+(int)Math.pow(r, count);
			 a=a/10;
		 }
		 if(temp==sum) {
			 System.out.println("Armstrong Number");
		 }else {
			 System.out.println("Not an Armstromg number");
		 }
	}

}
