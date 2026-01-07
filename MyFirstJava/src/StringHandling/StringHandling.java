//1.find Longest Word with Length in a String and in case contains the duplicate letter in word remove it and also contains same length words in the String check the alphabet series..
//
//Input 1 :  "I love programming"
//
//→ Longest word: "programming"
//→ After removing duplicates: "progaming"
//
//Output 1 : progaming
//
//------------------------------
//
//Input 2 :  "I love Java"
//
//→ Longest word: "love" (4), "Java" (4)
//→ Alphabetical order: "Java" < "love"
//→ After removing duplicates: "Java"
//
//Output 2 : Jav

package StringHandling;

public class StringHandling {

	public static void main(String[] args) {
		String s="i love programming";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String max="";
			for(int j=0;j<s1.length;j++) {
				if(s1[i].length()>s1[j].length()) {
					max+=s1[j];
				}
			}
			System.out.println(max);

		}
		
	}

}
