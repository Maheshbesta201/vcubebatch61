package javalooping;

import java.util.Scanner;

public class NonRepeat {

	public static void main(String[] args) {
		System.out.println("enter a num : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); //123656
		int a1=a;
		int max=0;
		while(a>0) {
			int c=0;
			int r=a%10;
			int d=a1;
			while(d>0) {
				int r1=d%10;
				if(r==r1) {
					c++;
				}
				d=d/10;
				
			}
			if(c==1 && max<r) {
				max=r;
			}
			System.out.println(r+"-->"+c);
			a=a/10;
		}
		System.out.println(max);
	}

}



