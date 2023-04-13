package com.extra;
class ThreadA extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Started");
			System.out.println("i ="+i);
			System.out.println("Thread ended");
		}
	}
}

public class ThreadEg {
	public static void main(String[] args) {
		System.out.println("Main Started");
		ThreadA t1 = new ThreadA();
		t1.start();
		System.out.println("Main ended");
	}
}
