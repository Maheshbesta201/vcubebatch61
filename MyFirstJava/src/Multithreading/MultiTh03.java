package Multithreading;

//sleep(milliseconds)
//
//Pauses current thread for given time.
//
//Thread returns to Runnable state after time completes.

public class MultiTh03 extends Thread{

	public static void main(String[] args){
		for(int i=0;i<5;i++) {
			System.out.println("main "+i);
		}
		MultiTh03 mm=new MultiTh03();
		mm.start();
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run "+i);
		}
	}

}
