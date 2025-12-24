package javalooping;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"); //014
		int n=sc.nextInt();
		IsDuckNumber(n);
	}

	static void IsDuckNumber(int n) {
		String s=Integer.toString(n);
		int a=s.length();
		while(a!=0) {
			int r=n%10; //4,1,0
			if(a==1) {
				System.out.println("Not a Duck number");
			}
			if(r==0){
				System.out.println("duck number");
				break;
			}
			n=n/10;
			a--;

			
		}
	}

}
