package Practice;

public class Arrays {

	public static void main(String[] args) {
		int arr[]= {12,36,45,87,91,63,74,28,39};
		int arr1[]=new int[arr.length];
		int a=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int b=arr[j];  
				int c=arr[j]%10;
				if(c==a) {
					arr1[i]=b;
				}
			}
			System.out.print(a+" ");
			a++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
