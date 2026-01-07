package StringHandling;

public class CharCount {

	public static void main(String[] args) {
		String s="a1b2c3";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			if(Character.isDigit(c)) {
				s1=s1+c;
			}else {
				s2=s2+c;
			}	
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
