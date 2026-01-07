package Practice;

public class Multithread01 extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run"+i);
		}
		
	}

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main"+i);
		}
	}

}
