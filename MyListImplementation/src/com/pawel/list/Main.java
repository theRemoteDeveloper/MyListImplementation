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
	}
	
}
