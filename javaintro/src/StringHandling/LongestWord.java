package StringHandling;

public class LongestWord {

	public static void main(String[] args) {
		String name ="java is high level Programing Language";
		String longest="";
		String secondLongest="";
		String[] words=name.split(" ");
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
			if(word.length()>secondLongest.length() && !word.equals(longest)) {
				secondLongest=word;
			}
				
		}
		System.out.println(" Longest : "+longest);
		System.out.println("Second Longest : "+secondLongest);

	}

}
