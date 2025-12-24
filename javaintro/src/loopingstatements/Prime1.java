package loopingstatements;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int i = sc.nextInt();
		primenum(i);
	}

	static void primenum(int a) {
		for (int j = 1; j <= a; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;

				}
			}
			if (count == 2) {
				System.out.print(j + " ");
			}

		}
	}

}
