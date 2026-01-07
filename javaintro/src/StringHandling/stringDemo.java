package StringHandling;

public class stringDemo {

	public static void main(String[] args) {
		String s="mahesh";
		boolean[] b=new boolean[s.length()];
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(b[i]) {
				continue;
			}
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				b[j]=true;
					
					
					
				}
				
			}
			System.out.print(s.charAt(i)+"-->"+count);
			System.out.println();
		}
	}

}
