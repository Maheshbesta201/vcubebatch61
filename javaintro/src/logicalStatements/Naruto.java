package logicalStatements;

import java.util.Scanner;

public class Naruto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter team number in Naruto Anime");
		int team = sc.nextInt();
		switch (team) {
		case 7:
			System.out.println("Kakasi Sensei");
			System.out.println("Uzumaki Naruto");
			System.out.println("Sasuke Uchiha");
			System.out.println("Sakura Haruno");
			break;
		case 8:
			System.out.println("Kurenai Sensei");
			System.out.println("Hinata Hyuga");
			System.out.println("Kiba Inuzuka");
			System.out.println("Shino Aburame");
			break;
		case 9:
			System.out.println("Might Guy Sensei");
			System.out.println("Rock Lee");
			System.out.println("Neji Hyuga");
			System.out.println("Tenten");
			break;
		case 10:
			System.out.println("Asuma Sarutobi Sensei");
			System.out.println("Shikamaru Nara");
			System.out.println("Ino Yamanaka");
			System.out.println("Choji Akimichi");
			break;
		default:
			System.out.println("the team is not my favorate");
		}

	}

}
