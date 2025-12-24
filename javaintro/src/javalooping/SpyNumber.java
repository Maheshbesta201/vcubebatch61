package javalooping;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt(); //145
		SpyNum(a);
		}

	 static void SpyNum(int n) {
		 int b=n; //145
		 int sum=0;
		 int mul=1;
		 while(n!=0){   //145
			 int r=n%10;
			 sum=sum+r;
			 mul=mul*r;
			 n=n/10;
		 }
		 if(sum==mul) {
			 System.out.println("Spy  Number");
		 }else {
			 System.out.println("Not a Spy Number");
		 }
	}

}
