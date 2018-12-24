package com.pawel.list;

public class Node {
	
	private Node next;
	private Object data;
	
	
	public Node(Object value) {
		this.data=value;
		this.next=null;
	}
	
	
	public Node(Object value, Node nextNode) {
		this.data=value;
		this.next=nextNode;
	}
	
	
	public Object getData() {
		return this.data;
	}
	
	
	public void setData(Object value) {
		data=value;
	}
	
	
	public Node getNext() {
		return this.next;
	}
	
	
	public void setNext(Node nextNode) {
		this.next=nextNode;
	}
}
