package loopingstatements;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int i=sc.nextInt();
		even(i);
		odd(i);
		
	}
	static void even(int a) {
		int c=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				c=c+1;
			}
		}
		System.out.println("total even number in given range : "+a);
		System.out.println(c+" Numbers are there");
	}
	static void odd(int a) {
		int c=0;
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				c=c+1;
			}
			
		}
		System.out.println("total odd number in given range : "+a);
		System.out.println(c+" Numbers are there");
	}
	

}
