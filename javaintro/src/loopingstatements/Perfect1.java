package loopingstatements;

import java.util.Scanner;

public class Perfect1 {
	static int second = 0;
	public static void main(String[] args) {
		System.out.println("enter range : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		factor(a);
		System.out.println();
		System.out.println("Second perfect number is : " + second);

	}
	static void factor(int a) {
		int count = 0;
		long factorial = 1;
		for (int j = 1; j <= a; j++) {
			int sum = 0;
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
					sum = sum + i;
				}
			}
			if (j == sum) {
				System.out.print(j+" ");
				count++;
				if (count == 2) {
					second = j;
				}
			}

		}
		for (int s = 1; s < second; s++) {
			factorial = factorial * s;
		}
	}

}
