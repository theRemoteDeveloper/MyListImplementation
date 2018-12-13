package com.pawel.list;

public class MyList {

	private int size=0;
	private Node head;
	
	
	//add to the end of the list
	public void add(Object data) {
		if(head==null) {
			head=new Node(data);
		} else {
			Node currentNode = head;
			while(currentNode.getNext() != null) {
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(new Node(data));
		}
		this.size++;
	}

	
	//remove from the end of list
	public void remove() {
		if(head==null) {
			//nothing to remove
		} else {
			if(head.getNext()==null) {
				//list with only one element
				head=null;
			} else {
				Node prevNode = head;
				Node currentNode = head.getNext();
				while(currentNode.getNext()!=null) {
					prevNode=currentNode;
					currentNode=currentNode.getNext();
				}
				prevNode.setNext(null);
			}
			this.size--;
		}
		
	}
	
	
	public String toString() {
		String str = "[";
		
		if(this.head!=null) {
			str += head.getData().toString();
			
			if(head.getNext()!=null) {
				Node currentNode = head.getNext();
				while(currentNode.getNext()!=null) {
					str += ", " + currentNode.getData().toString();
					currentNode=currentNode.getNext();
				}
				str += ", " + currentNode.getData().toString();
			}
		}
		
		str += "]";
		return str;
	}
	
	
	public int getListSize() {
		return this.size;
	}
	
}
