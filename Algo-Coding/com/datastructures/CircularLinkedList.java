package com.datastructures;

public class CircularLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node last;
	
	public Node addInEmptyList(int data) {
		
		Node tmp = new Node(data);
		last = tmp;
		last.next = last;
		
		return last;
	}
	
	public Node addAtStart(int data) {
		
		if(last == null) {
			addInEmptyList(data);
		}
		Node tmp = new Node(data);
		tmp.next = last.next;
		last.next = tmp;
		
		return last;
	}
	
	public Node addAtEnd(int data) {
		if(last == null) {
			addInEmptyList(data);
		}
		Node tmp = new Node(data);
		tmp.next = last.next;
		last.next = tmp;
		last = tmp;
		
		return last;
	}
	
	public Node addAfterData(int data, int after) {
		
		Node pos = last.next;
		while(pos != last.next) {
			if(pos.data == after) {
				Node tmp = new Node(data);
				tmp.next = pos.next;
				pos.next = tmp;
				
				if(pos == last) {
					last = tmp;
					return last;
				}
				break;
			}
			pos = pos.next;
		}
		return last;
	}
	
	
	public void deleteNode(int key) {
		
		if(last == null) {
			return;
		}
		
		Node tmp = last.next;
		Node prev = last;
		
		while(tmp != last.next) {
			if(tmp.data == key) {
				if(tmp == last) {
					prev.next = last.next;
					last = prev;
				}
				prev.next = tmp.next;
				tmp.next = null;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		
		
	}
}
