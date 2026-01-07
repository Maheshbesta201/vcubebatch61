package javalooping;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt(); // 145
		NeonNum(a);
	}

	static void NeonNum(int n) {
		for (int i = 0; i <= n; i++) {
			int s = i * i;
			int sum = 0;
			while (s != 0) { // 145
				int r = s % 10;
				sum = sum + r;// 5
				s = s / 10;
			}
			if (sum == i) {
				System.out.print(sum+" ");
			} 
		}
	}

}
