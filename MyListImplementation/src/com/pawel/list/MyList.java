package com.pawel.list;

public class MyList {

	private int size=0;
	private Node head;
	
	
	//add to the end of the list
	public void add(Object data) {
		if(head==null) {
			head = new Node(data);
		} else {
			Node currentNode = head;
			while(currentNode.getNext() != null) {
				currentNode=currentNode.getNext();
			}
			currentNode.setNext(new Node(data));
		}
		this.size++;
	}
	
	
	//add to the specific index of list
	public void addAtIndex(Object data, int index) {
		int i=0;
		if(head==null && index==0) {
			head = new Node(data);
		} else {
			Node currentNode=head;
			Node prevNode = null;
			while(i < index) {
				prevNode=currentNode;
				currentNode=currentNode.getNext();
				i++;
			}
			if(prevNode==null) {
				head = new Node(data);
				head.setNext(currentNode);
				this.size++;
			} else {
				prevNode.setNext(new Node(data));
				prevNode.getNext().setNext(currentNode);
				this.size++;
			}	
		}
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
	
	
	//remove element at the specific index of list
	public void removeAtIndex(int index) {
		int i=0;
		if(head.getNext()==null) {
			head=null;
		}else {
			Node prevNode = null;
			Node currentNode = head;
			while(i < index) {
				prevNode=currentNode;
				currentNode=currentNode.getNext();
				i++;
			}
			if(prevNode==null) {
				head=currentNode.getNext();
			} else {
				if(currentNode.getNext() != null) {
					prevNode.setNext(currentNode.getNext());
				}
				currentNode=null;				
			}
		}
		this.size--;
	}
	
	
	//get list element at specific index
	public Node getNodeAtIndex(int index) {
		Node node;
		int i=0;
		node=head;
		while(i<index) {
			node=node.getNext();
			i++;
		}
		return node;
	}
	
	
	public Node getFirstNode() {
		return getNodeAtIndex(0);
	}

	
	public Node getLastNode() {
		return getNodeAtIndex(this.size-1);
	}
	
	
	public String getNodeValueAtIndex(int index) {
		Node node = getNodeAtIndex(index);
		return node.getData().toString();
	}
	
	
	public void reverse() {
	    Node next = null; 
	    Node prev = null; 
		int i = 0;
	    
		while(head != null && i<this.getListSize()) {
			next = head.getNext();
	    		head.setNext(prev);
	    		prev=head;
	    		head=next;
	  
	    		i++;
		}
		System.out.println("end");
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


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.getListSize()==0;
	}
	
}
