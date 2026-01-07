//Batch-61 : Assignment (09/10/2025)
//
//Java:
//
//1.Write a program to reverse each word in a given sentence while keeping the word order the same.
//Example:
//Input: "Java is Fun"
//Output: "avaJ si nuF"
package StringHandling;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s="Java is Fun";
		String[] arr=s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) { 
				s1+=arr[i].charAt(j);
			}
			s1+=" ";	
		}
		System.out.println(s1);
	}

}
