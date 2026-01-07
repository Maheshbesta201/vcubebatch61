package StringHandling;

public class VowelCount {

	public static void main(String[] args) {
		String s="Hello World";
		char[] c=s.toLowerCase().toCharArray();
		int v=0;
		int c1=0;
		int space=0;
		
		for(char ch:c) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v++;
			}else if(ch==' ') {
				space++;
			}else {
				c1++;
			}
		}
		System.out.println("vowels Count :"+v);
		System.out.println("Consonant Count :"+c1);
		System.out.println("Space Count :"+space);

	}

}
