package com.pawel.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyListTest {
	
	private MyList myList;
	
	@Before
	public void setUp() {
		myList = new MyList();
	}
	
	@Test
	public void isEmptyTest() {
		 assertTrue(myList.isEmpty());
	}
	
	@Test
	public void hasOneElement() {
		myList.add("First element");
		assertTrue(myList.getListSize()==1);
	}

}
