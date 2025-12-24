package loopingstatements;

import java.util.Scanner;

public class Prime11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a range :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {   //1<=100;
			int count=0;
			for(int j=1;j<=i;j++) {   //j=1;1<=1;    2<=1
				if(i%j==0) {    //5%1==0,5%2==0,4%3==0;4%4==0,1%1==0
					count++;    //1,2
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		
	}

}
	
