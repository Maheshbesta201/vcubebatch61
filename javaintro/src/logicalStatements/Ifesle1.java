package logicalStatements;

import java.util.Scanner;

public class Ifesle1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter employee name : ");
		String s1 = s.next();
		System.out.println("enter employee experience : ");
		int i = s.nextInt();
		if (i <= 1) {
			int h = 0;
			System.out.println("employee name : " + s1);
			System.out.println("employee exp : " + i);
			System.out.println("employee bonous : " + h);
		} else {
			if (i >= 2 && i <= 4) {
				int h = 5000;
				System.out.println("employee name : " + s1);
				System.out.println("employee exp : " + i);
				System.out.println("employee bonous : " + h);
			}
			if (i >= 5 && i <= 9) {
				int h = 10000;
				System.out.println("employee name : " + s1);
				System.out.println("employee exp : " + i);
				System.out.println("employee bonous : " + h);
			} else {
				if (i >= 10) {
					int h = 0;
					System.out.println("employee name : " + s1);
					System.out.println("employee exp : " + i);
					System.out.println("employee bonous : " + h);
				} else {
					System.out.println("enter valid exp ");
				}

			}

		}
	}
}
