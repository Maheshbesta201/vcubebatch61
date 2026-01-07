package loopingstatements;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number : ");
		int i = sc.nextInt();
		primenum(i);
	}

	static void primenum(int a) {
		int s=0;
		for (int j = 1; j <= 100; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;

				}
			}
			if (count == 2) {
				s++;
				if(s==a) {
					System.out.print("nth prime number :"+j);
				}
				
			}

		}
	}

}
