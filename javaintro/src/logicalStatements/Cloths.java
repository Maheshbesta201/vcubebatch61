package logicalStatements;

import java.util.Scanner;

public class Cloths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome which one you are ! men,kids,children");
		String cloths = sc.next();
		switch (cloths) {
		case "men":
			System.out.println("Shirt or Pants");
			String s = sc.next();
			switch (s) {
			case "shirt":
				System.out.println("Enter shirt size in num");
				int i = sc.nextInt();
				switch (i) {
				case 26:
					System.out.println("Size S");
					break;
				case 28:
					System.out.println("Size M");
					break;
				case 30:
					System.out.println("Size L");
					break;
				case 32:
					System.out.println("Size XL");
					break;
				case 34:
					System.out.println("Size XXL");
					break;
				default:
					System.out.println("The entered size is not there in my collection");
					break;
				}
			case "pants":
				System.out.println("Enter pant size in num");
				int i1 = sc.nextInt();
				switch (i1) {
				case 26:
					System.out.println("Size S");
					break;
				case 28:
					System.out.println("Size M");
					break;
				case 30:
					System.out.println("Size L");
					break;
				case 32:
					System.out.println("Size XL");
					break;
				case 34:
					System.out.println("Size XXL");
					break;

				default:
					System.out.println("The entered size is not there in my collection");
					break;
			}
		case "kids":
			System.out.println("Enter size in num");
			int i2 = sc.nextInt();
			switch (i2) {
			case 20:
				System.out.println("size sss");
				break;
			case 22:
				System.out.println("size ss");
				break;
			default:
				System.out.println("The entered size is not there in my collection");
				break;
			}
		case "children":
			System.out.println("Enter size in num");
			int i3 = sc.nextInt();
			switch (i3) {
			case 24:
				System.out.println("size sl");
				break;
			case 26:
				System.out.println("size s");
				break;

			}
		}

	}
}
}
