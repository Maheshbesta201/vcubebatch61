//1.Write a Java program to remove all adjacent duplicate characters from a given string.
//The program should repeatedly remove adjacent pairs of the same character until no such pairs remain.
//
//Example:
//
//Input:  AKKABNBY  
//Output: BNBY
//
//2.Write a Java program to generate all combinations (subsets) of the characters in a given string.
//
//Example:
//
//Input:  abc
//Output:
//a  
//b  
//c  
//ab  
//ac  
//bc  
//abc
package StringHandling;

public class Duplicates {

	public static void main(String[] args) {
		String s = "AKKABNBKY";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				s = s.substring(0, i) + s.substring(i + 2, s.length());
				
			}

		}
		System.out.println(s);
	}

}
