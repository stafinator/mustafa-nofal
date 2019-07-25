package com.revature.threadz;

public class ThreadDemo {

	
	public static void main(String[] args) {
		Thread extendThread = new ExtendThread(); //, similar to Array List construction,mainly for larger programs, basically for type safety and easier to switch things.
		Thread implementThread = new Thread(new ImplementRunnable());
		
		implementThread.setPriority(10);//priority is 1-10 1 is the lowest, 10 is the highest.
		extendThread.start();
		implementThread.start();
		for(int i = 0; i<100;i++) {
			System.out.println("ello-Driver");
		}
	}
	
}
