package Practice;

public class Exam04 {

	public static void main(String[] args) {
		int[] arr= {2,-3,4,1,1,7};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int a=1;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			a++;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==a) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(a);
				break;
			}
		}

	}

}
