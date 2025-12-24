package logicalStatements;

import java.util.Scanner;

public class Mobile {
	static Scanner sc=new Scanner(System.in);
	static String s ="1.Battery issuses";
	static String s1 ="2.Network issuses";
	static String s2="3.App Crashes";
	static String s3 ="4.Storage issuses";
	static String s4 ="5.Exit";


	public static void main(String[] args) {
		Mobile m=new Mobile();
		System.out.println("Hello Welcome to Vivo Service Center !!");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		int i=sc.nextInt();
		switch (i) {
			case 1:
				m.HandleBatteryIsuses();
				break;
			case 2:
				m.HandleNetworkIsuses();
				break;
			case 3:
				m.HandleAppcrashes();
				break;
			case 4:
				m.HandleStorageIsuses();
				break;
			case 5:
				m.exit();
				break;
				default :
					System.out.println("please enter valid input ");

	}
	}
	void HandleBatteryIsuses() {
		System.out.println("is your mobile is over heated");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			System.out.println("adjust your brightness and dont use for sometime");
		}else {
			System.out.println("replace your battery");
		}
	}
	void HandleNetworkIsuses() {
		System.out.println("is your mobile network is not showing");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			System.out.println("Turn on and off aeroplane mode ");
		}else {
			System.out.println("Remove your sim and re-insert ");
		}
		
	}void HandleStorageIsuses() {
		System.out.println("is your mobile storage is full");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			System.out.println("please remove some large items and refresh it");
		}else {
			System.out.println("factory data reset");
		}
		
	}void HandleAppcrashes() {
		System.out.println("is your mobile apps are crashed");
		String s=sc.next();
		if(s.equalsIgnoreCase("yes")) {
			System.out.println("close all apps and refresh it");
		}else {
			System.out.println("restart the mobile");
		}
		
	}void exit(){
		System.out.println("thank you for visiting vivo service center");
	}

}
