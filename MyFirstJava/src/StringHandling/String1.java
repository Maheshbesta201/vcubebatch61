//Write a Java program to find the longest word in a sentence that:
//-> Contains at least one vowel, and
//-> Does not contain any repeating characters.
//
//ex: input:- String sentence = "Smart people plan daily work perfectly";
//    output:- Smart

package StringHandling;

public class String1 {
	
	public static boolean nonrepeat(String word) {
		word=word.toLowerCase();
		for(int i=0;i<word.length();i++) {
			for(int j=i+1;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static boolean vowel(String word) {
		word=word.toLowerCase();
		return word.contains('a'+"") ||word.contains('e'+"") 
				||word.contains('i'+"") ||word.contains('o'+"") 
				||word.contains('u'+""); 
	}

	public static void main(String[] args) {
		String s="Smart people plan daily work perfectly";
		String[] arr=s.split(" ");
		String max="";
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
  				if(vowel(word)&&nonrepeat(word)) {
					if(word.length()>max.length()) {
							max=word;
						}
					}
					
				}
		
		System.out.println(max);
	}

}
