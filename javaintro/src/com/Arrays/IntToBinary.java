package com.Arrays;

public class IntToBinary {

	public static void main(String[] args) {
		Integer[] arr= {10,20,128,130};
		String[] str=new String[arr.length];
		for(int i=0;i<arr.length;i++){
			String  s="";
			while(arr[i]!=0) {
				int r=arr[i]%2;
				s=r+s;
				arr[i]=arr[i]/2;
			}
			str[i]=s;
		}
		for(String s1:str) {
			System.out.print(s1+" ");
		}
			}

}
