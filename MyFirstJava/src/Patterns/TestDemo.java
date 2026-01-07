package Patterns;

public class TestDemo {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=3;j++){
//				if(i%2==0 && j==0) {
//					System.out.print("*");
//				}
				if(i+j==3) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}

}
