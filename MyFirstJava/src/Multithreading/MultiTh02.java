package Multithreading;

public class MultiTh02 implements Runnable{

	public static void main(String[] args) {
		MultiTh02 m=new MultiTh02();
		Thread t=new Thread(m);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("main "+i);
		}
		
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run "+i);
		}
	}

}
