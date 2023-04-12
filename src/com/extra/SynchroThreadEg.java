package com.extra;

class Thread1{

	public synchronized void print1_5() {
		System.out.println("Method started");

		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("i = " + i);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Method ended");
	}

}

class Thread2 extends Thread{
	Thread1 t1;
	public Thread2(Thread1 t1) {
		this.t1 = t1;
	}
	public void run() {
		t1.print1_5();
	}
	
}

public class SynchroThreadEg {

	public static void main(String[] args) {
		System.out.println("Main started");
		Thread1 t1 = new Thread1();
		Thread2 ta = new Thread2(t1);
		Thread2 tb = new Thread2(t1);
		ta.start();
		tb.start();
		System.out.println("Main ended");
	}

}