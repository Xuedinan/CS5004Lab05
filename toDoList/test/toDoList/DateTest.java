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

public class DateTest {
	
	Date test1 = new Date(1, 3, 2022);
	Date test2 = new Date(3, 5, 2024);
	
	// test all getters
	@Test
	public void gettersTest() {
		assertEquals(1, test1.getDay(), 0.001);
		assertEquals(3, test2.getDay(), 0.001);
		assertEquals(3, test1.getMonth(), 0.001);
		assertEquals(5, test2.getMonth(), 0.001);
		assertEquals(2022, test1.getYear(), 0.001);
		assertEquals(2024, test2.getYear(), 0.001);
	}
	
	// test all setters
	@Test
	public void settersTest() {
		
		test1.setDay(20);
		assertEquals(20, test1.getDay(), 0.001);
		test2.setDay(30);
		assertEquals(30, test2.getDay(), 0.001);
		
		test1.setMonth(8);
		assertEquals(8, test1.getMonth(), 0.001);
		test2.setMonth(7);
		assertEquals(7, test2.getMonth(), 0.001);
		
		test1.setYear(2001);
		assertEquals(2001, test1.getYear(), 0.001);
		test2.setYear(2022);
		assertEquals(2022, test2.getYear(), 0.001);
	}

}
