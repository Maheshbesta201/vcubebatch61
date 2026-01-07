package javalooping;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		while (a > 9) {
			int sum = 0;
			while (a != 0) {
				int r = a % 10;
				sum = sum + r;
				a = a / 10;
			}
			a = sum;
		}
		System.out.println(a);
	}

}
