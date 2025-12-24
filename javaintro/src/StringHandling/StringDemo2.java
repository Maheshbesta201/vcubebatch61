package StringHandling;

public class StringDemo2 {

	public static void main(String[] args) {
		String s="find the longest string";
		String[] s1=s.split(" ");
		String[] s2=new String[s1.length];
		int max1=0;
		String max="";
		String max2="";
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].length()>max1) {
					
					max=s1[i];
			}
				else {
					max2=s1[i];
				}
			}
		}
		System.out.println(max);
		System.out.println(max2);

	}

}
