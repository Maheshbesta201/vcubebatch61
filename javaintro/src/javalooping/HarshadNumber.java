package javalooping;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		if (Harshadnumber(a)) {
			System.out.println("Harshad number");
		} else {
			System.out.println("Not Harshad number");
		}
	}

	static boolean Harshadnumber(int a) {
		int b = a;
		while (a > 9) {
			int sum = 0;
			while (a != 0) {
				int r = a % 10;
				sum = sum + r;
				a = a / 10;
			}
			a = sum;
		}
		return b % a == 0;
	}
}
