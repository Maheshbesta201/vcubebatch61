package StringHandling;

public class Reverse {

	public static void main(String[] args) {
		String s="i love vcube";
//		String s1=s.replace(" ", "");
//		char[] c=s1.toCharArray();
//		int a=0;
//		char[] c1=new char[c.length];
//		for(int i=c.length-1;i>=0;i--) {
//			c1[a]=c[i];
//			a++;
//		}
//		
//		for(char b:c1) {
//			System.out.print(b+"");
//		}
		
		String[] arr=s.split(" ");
		String arr1=s.replaceAll(" ", "");
		int index=arr1.length()-1;
		String y="";
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			for(int j=0;j<s1.length();j++) {
				y+=arr1.charAt(index);
				index--;
			}
			y+=" ";
		}
		System.out.println(y);
	}
}
