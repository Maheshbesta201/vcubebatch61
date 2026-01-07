package loopingstatements;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=factor(a);
		if(b==a) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number ");
		}
	}

	static int factor(int a) {
		int sum=0;
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0) {
				sum=sum+i;
			}
		}
		return sum;
		
	}

}
