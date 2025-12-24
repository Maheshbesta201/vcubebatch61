package loopingstatements;

public class Loop4 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=30;i=i+2) {
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println(sum);
	}

}
