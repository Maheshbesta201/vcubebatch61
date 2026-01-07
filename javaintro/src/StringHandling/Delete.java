package StringHandling;

public class Delete {

	public static void main(String[] args) {
		String sb = "hello world";
		String s = sb.replace(" ", "");
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length();) {
			for (int j = 0; j < 2 && i < s.length(); j++, i++) {
				s1 = s1 + s.charAt(i);
			}
			for (int k = 0; k < 2 && i < s.length(); k++, i++) {
				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
