package javalooping;

import java.util.Scanner;

public class FirstNonRep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int n1=n;
		while(n>0) {
			boolean b=true;
			int r=n%10;
			int d=n1;
			int c=0;
			while(d>0) {
				int r1=d%10;
				if(r==r1) {
					c++;
				}
				d=d/10;
			}
			if(c==1) {
				System.out.println(r);
				break;
			}
			n=n/10;
		}
	}

}
