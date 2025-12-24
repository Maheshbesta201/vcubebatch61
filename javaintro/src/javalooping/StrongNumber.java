package javalooping;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt(); //145
		StrongNum(a);
		}

	 static void StrongNum(int n) {
		 int b=n; //145
		 int sum=0;
		 while(n!=0){   //145
			 int r=n%10;  //5
			 int s=1;     //1
			 for(int i=1;i<=r;i++) {
				 s=s*i; 
			 }
			 sum=sum+s; 
			 n=n/10;
		 }
		 if(sum==b) {
			 System.out.println("Strong  Number");
		 }else {
			 System.out.println("Not a Strong Number");
		 }
	}

}
