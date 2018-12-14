package com.pawel.list;

public class Main {
	
	public static void main(String[] args) {
		
		MyList myList = new MyList();
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		myList.add(60);
		myList.add(70);
	
		System.out.println("List: "+myList.toString());
		System.out.println("List size: "+myList.getListSize());
		
		myList.remove();
		myList.remove();
		myList.remove();
		
		System.out.println("List: "+myList.toString());
		System.out.println("List size: "+myList.getListSize());
		
		myList.addAtIndex(200, 4);
		myList.addAtIndex(300, 5);
		myList.addAtIndex(400, 6);
		myList.addAtIndex(900, 2);
		myList.addAtIndex(700, 0);
		myList.addAtIndex(990, 0);
		
		System.out.println("List: "+myList.toString());
		System.out.println("List size: "+myList.getListSize());
	}
	
}
