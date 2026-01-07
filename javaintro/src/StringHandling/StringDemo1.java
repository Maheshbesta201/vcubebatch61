package StringHandling;

public class StringDemo1 {

	public static void main(String[] args) {
		String s="find the longest string";
		String[] s1=s.split(" ");
		String max="";
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].length()>s1[j].length()) {
					max=s1[i];
			}				
			}
		}
		System.out.println("Longest String: "+max);
	}

}
