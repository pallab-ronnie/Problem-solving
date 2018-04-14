package com.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int top;
	
	public void push(int value) {
		q1.add(value);
		top = value;
	}
	
	public void pop() {
		while(q1.size() >1) {
			top = q1.remove();
			q2.add(top);
		}
		
		q1.remove();
		Queue<Integer> tmp = q1;
		q1 = q2;
		q2 = tmp;
	}
}
