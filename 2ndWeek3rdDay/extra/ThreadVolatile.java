package com.extra;



class ThreadAA extends Thread {

	int f;
	public ThreadAA(int f) {
		this.f = f;
	}

	@Override
	public void run() {
		System.out.println("ThreadAA method start");
		while (f < 10) {
			System.out.println("ThreadAA x = " + f);
			f++;
		}
		System.out.println("ThreadAA method end");
	}

}

class ThreadBB extends Thread {

	int f;
	public ThreadBB(int f) {
		this.f = f;
	}

	@Override
	public void run() {
		//int x = 1;
		System.out.println("ThreadBB method start");
		while (f < 10) {
			System.out.println("ThreadBB x = " + f);
			f++;
		}
		System.out.println("ThreadBB method end");

	}

}

public class ThreadVolatile {

	public static volatile int num = 0;
	public static void main(String[] args) {
		//InitialClass f = new InitialClass();
		//System.out.println(f.num);		
		ThreadAA a = new ThreadAA(num);
		a.start();
		System.out.println(num);
		ThreadBB b = new ThreadBB(num);
		b.start();
		// new Consumer(f);
	}

}
