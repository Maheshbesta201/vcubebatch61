package javalooping;

import java.util.Scanner;

public class Rental {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of Customers :");
		int a = sc.nextInt();
		int total=0;
		for (int i=1;i<=a;i++) {
			int sum=0;
			System.out.println("for Customer : "+i);
			System.out.println("hello sir how many bikes you want : ");
			int b=sc.nextInt();
			int bike=1;
			while(b!=0) {
				System.out.println("how many hours  do you want for bike "+bike);
				int c=sc.nextInt();
				int hrs=50*c;
				bike++;
				if(c>5) {
					int discount=(hrs*10)/100;
					int i1=hrs-discount;
					sum=sum+i1;
				}else {
					sum=sum+hrs;
				}
				b--;
			}
			System.out.println(i+" Customer Amount is : "+sum);
			total=total+sum;
		}
		System.out.println("total amount for the day is : "+total);
		 
	}

}
