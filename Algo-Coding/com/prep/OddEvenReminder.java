package com.prep;

public class OddEvenReminder implements Runnable{
	
	 int reminder;
	  Object lock;
	int max = 100;
	static  int num;
	
	
	public OddEvenReminder(int reminder, Object lock) {
		this.reminder = reminder;
		this.lock = lock;
		num = 1;
	}

	@Override
	public void run() {
		while(num < max) {
			synchronized (lock) {
				while(num % 2!= reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(num);
				num++;
				lock.notifyAll();
			}	
		}
		
	}
	
	public static void main(String[] args) {
		Object lock = new Object();
		OddEvenReminder odd = new OddEvenReminder(1,lock);
		OddEvenReminder even = new OddEvenReminder(0,lock);
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.start();
		t2.start();
	}
	
	
}
