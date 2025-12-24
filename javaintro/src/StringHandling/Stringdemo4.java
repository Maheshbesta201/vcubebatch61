package StringHandling;

import java.util.Scanner;

public class Stringdemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		char[] ch1 = s1.toCharArray();//listen
		char[] ch2 = s2.toCharArray();//silent
		if (s1.length() != s2.length()) {
			System.out.println("Not anagrams");
			return;
		}
		int[] freq = new int[26];
		for (int i = 0; i < ch1.length; i++) {
			freq[ch1[i] - 'a']++;//12
			freq[ch2[i] - 'a']--;//17
		}
		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if (freq[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
	}

}
