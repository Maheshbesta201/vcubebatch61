package Multithreading;

public class Multith extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("run "+i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Multith m=new Multith();
		for(int i=0;i<10;i++) {
			System.out.println("main "+i);
		}
		m.start();
		System.out.println("main method ended");
		
		

	}

}
