package javalooping;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range : ");
		int n=sc.nextInt();
		even(n);
		
	}
	static void even(int n){
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
		}
		}
	}

}
