package StringHandling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "listen";
		String s2 = "silint";
		char[] ch1 = s1.toCharArray();//listen
		char[] ch2 = s2.toCharArray();//silent
		int[] freq = new int[26];
		for (int i = 0; i < ch1.length; i++) {
			freq[ch1[i] - 'a']++;//12
			freq[ch2[i] - 'a']--;//17
		}
		for(int a:freq) {
			System.out.print(a+" ");
		}
	}

}
