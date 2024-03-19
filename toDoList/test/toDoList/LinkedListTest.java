package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 */

import static org.junit.Assert.*;

import org.junit.Test;

//more complex functions will be tested in Driver

public class LinkedListTest {
	
	LinkedList<Integer> test1 = new LinkedList<Integer>();
	
	// test count
	@Test
	public void countTest() {
		test1.addNode(1);
		test1.addNode(2);
		test1.addNode(3);
		assertEquals(3, test1.count());
	}
	
	// test getNode
	@Test
	public void getNodeTest() {
		test1.addNode(1);
		test1.addNode(2);
		test1.addNode(3);
		assertEquals("3", test1.getNode(0));
		assertEquals("2", test1.getNode(1));
		assertEquals("1", test1.getNode(2));
	}
	
	// test removeAll
	@Test
	public void removeAllNode() {
		test1.removeAllNode();
		assertEquals("", test1.toString());
	}
}
