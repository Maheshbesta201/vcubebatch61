package javalooping;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//19
		IsHappyNumber(n);
	}

	static void IsHappyNumber(int n) {
		int a=n;
		int sum=0;
		while(n>1) {
			sum=0;
			while(n!=0) {
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		if(sum==1) {
			System.out.println("happy number");
		}
		else {
			System.out.println("not a happy number");
		}
		
		
	}

}
