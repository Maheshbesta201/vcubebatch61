package StringHandling;

public class Vowel {
	
	public static void main(String[] args) {
		String s="Hello World";
		char[] c=s.toLowerCase().toCharArray();
		String s1="";
		int v=0;
		int c1=0;
		int space=0;
		
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				c[i]++;
			}
		}
		System.out.println(new String(c));
	}
}
