package loopingstatements;

import java.util.Scanner;

public class Prime3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number : ");
		int i = sc.nextInt();
		primenum(i);
	}

	static void primenum(int a) {
		int s = a;
		int num = 0;
		int j = 2;
		while (true) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					count++;

				}
			}
			if (count == 2) {
				num++;
				System.out.print(j + " ");

			}
			j++;
			if(s==num) {
				break;
			}

		}

	}
}
