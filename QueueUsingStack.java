package com.datastructures;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	
	public int size() {
		return s1.size() + s2.size();
	}
	
	public void enQueue(int value) {
		s1.push(value);
	}
	
	public int deQueue() {
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
}
