package Multithreading;

//Gives a chance to other threads of equal priority.
//
//Not guaranteed.

public class MultiTh04 extends Thread{

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
			System.out.println("run "+i);	
		}
		Thread.yield();
	}

}
