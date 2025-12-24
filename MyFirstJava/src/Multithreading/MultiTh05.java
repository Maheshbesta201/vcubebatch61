//package Multithreading;
//
//class yield extends Thread {
//    @Override
//    public void run() {
//        for(int i=1; i<=5; i++) {
//            System.out.println(Thread.currentThread().getName() + " : " + i);
//
//            // Make the current thread give chance to others
//            Thread.yield();
//        }
//    }
//}
//
//public class MultiTh05 {
//    public static void main(String[] args) {
//
//    	YieldDemo t1 = new YieldDemo();
//    	YieldDemo t2 = new YieldDemo();
//        t1.start();
//        t2.start();
//    }
//}
