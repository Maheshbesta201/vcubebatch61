package loopingstatements;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which table you want !!");
		int n=sc.nextInt();
		System.out.println("Please enter the range");
		int n1=sc.nextInt();
		caltable(n,n1);
		
	}
	static void caltable(int a,int b) {
		for(int i=1;i<=b;i++) {
			System.out.println(a +" * " +i+ " = " +i*a);
		}
	}

}
