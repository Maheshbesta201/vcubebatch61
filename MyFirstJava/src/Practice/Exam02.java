package Practice;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int minute =sc.nextInt();
		int second =minute*60;
		System.out.println("minute : "+minute);
		System.out.println("second :"+second);
		sc.close();

	}

}
