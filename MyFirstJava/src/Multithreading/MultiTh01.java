package Multithreading;

class hello extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hello "+i);
		}
	}
}

public class MultiTh01 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("run "+i);
		}
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		MultiTh01 m=new MultiTh01();
		MultiTh01 h1=new MultiTh01();
		h1.start();
		m.start();
		for(int i=1;i<=3;i++) {
			System.out.println("main "+i);
		}
	}

}
