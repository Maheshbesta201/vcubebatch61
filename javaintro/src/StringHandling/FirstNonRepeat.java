package StringHandling;

public class FirstNonRepeat {

	public static void main(String[] args) {
		String s="mahesh";
		
		char[] s1=s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			int count =1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]==s1[j]) {
					count++;
				}	
			}
			if(count==1) {
				System.out.println(s1[i]);
				break;
			}
		}
	}


}
