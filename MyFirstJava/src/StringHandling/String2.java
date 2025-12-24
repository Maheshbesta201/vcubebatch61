//1.Write a Java program to print all permutations of a given string.
//
//Input: "abc"
//Output:
//abc
//acb
//bac
//bca
//cab
//cba

package StringHandling;

public class String2 {

	public static void main(String[] args) {
		String s="abc";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				String f=s.charAt(j)+"";
				String l=s.substring(j,s.length());
				System.out.println(c+l+f);
			}
		}
//		System.out.println(s.substring(1,s.length()));
	}

}
