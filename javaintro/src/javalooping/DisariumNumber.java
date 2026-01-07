package javalooping;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Isdisarium(n);
		
	}

	 static void Isdisarium(int n) {
		 String  s=Integer.toString(n);
		 int d=s.length();
		 int a=n;
		 int sum=0;
		 while(n!=0) {
			 int r=n%10;
			 sum=sum+(int)Math.pow(r, d);
			 n=n/10;
			 d--;
		 }
		 if(sum==a){
			 System.out.println("Disarium number");	 
			 }else {
				 System.out.println("Not a Disarium number");
		 }
		 
	}

}
