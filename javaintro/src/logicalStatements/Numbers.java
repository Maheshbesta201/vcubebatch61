package logicalStatements;

public class Numbers {
	static int i=1;
	public static void main(String[] args) {
		main();
	}
	static void main(){
		if(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			main1();
			}
		}
	static void main1(){
		main();
	}
	

}
