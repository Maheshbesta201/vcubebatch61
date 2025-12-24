//2.Write a program that swaps the first and last character of every word in a sentence.
//Example:
//Input: "Hello World"
//Output: "oellH dorlW"
package StringHandling;

public class SwapFirstAndLast {

	public static void main(String[] args) {
		String s="Hello World";
		String[] arr=s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			char c1=arr[i].charAt(0);
			char c2=arr[i].charAt(arr[i].length()-1);
			String s2=arr[i].substring(1,arr[i].length()-1);
			s1+=(c2+s2+c1)+" ";
			}
		System.out.println(s1);
		}
	

}
