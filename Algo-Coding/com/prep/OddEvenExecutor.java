package com.prep;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OddEvenExecutor {
	
	static int count = 1;
	static boolean odd = true;
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		int max = 100;		
		final Object lock =  new Object();
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
				
				while(count< max) {
					synchronized (lock) {
						while(!odd) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(count++);
						odd = false;
						lock.notify();
					}
				}
			}
			
		});
		
		executor.submit(new Runnable() {

			@Override
			public void run() {

				while(count<max) {
					synchronized (lock) {
						while(odd) {
							try {
								lock.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(count++);
						odd = true;
						lock.notify();
					}
				}
			}
			
		});
		
		executor.shutdown();
		
		try {
			if(!executor.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
				executor.shutdownNow();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
