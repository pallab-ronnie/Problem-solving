package com.datastructures;

import java.util.Arrays;

public class CustomArrayList {
	
	private Object[] store;
	private int size;
	
	public CustomArrayList() {
		store = new Object[10];
	}
	
	public void add(Object o) {
		if(store.length - size <=2) {
			incrementSize();
		}
		store[size++] = o;
	}
	
	public Object get(int index) {
		if(index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return store[index];
	}
	
	private void incrementSize() {
		store = Arrays.copyOf(store, store.length *3/2 +1);
		System.out.println("New length " + store.length);
	}
	
	public int size() {
		return size;
	}
	
	public Object remove(int index) {
		if(index < size) {
			Object obj = store[index];
			store[index] = null;
			int tmp = index;
			while(tmp < size) {
				store[tmp] = store[tmp + 1];
				store[tmp + 1] = null;
				tmp ++;
			}
			size --;
			return obj;
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
