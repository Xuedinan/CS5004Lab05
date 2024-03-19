package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 */

import static org.junit.Assert.*;

import org.junit.Test;

// more complex functions will be tested in Driver

public class TaskTest {
	
	Date date1 = new Date(3, 12, 2023);
	Task task1 = new Task("test1", date1, TaskStatus.ONGOING, PriorityType.LOW);
	Date date2 = new Date(10, 12, 2002);
	Task task2 = new Task("test2", date2, TaskStatus.ONGOING, PriorityType.HIGH);
	
	// test getters
	@Test
	public void gettersTest() {
		assertEquals("test1", task1.getContent());
		assertEquals(PriorityType.LOW, task1.getPriority());
		assertEquals(TaskStatus.ONGOING, task1.getStatus());
		assertEquals(2023, task1.getDate().year, 0.001);
		
		assertEquals("test2", task2.getContent());
		assertEquals(PriorityType.HIGH, task2.getPriority());
		assertEquals(TaskStatus.ONGOING, task2.getStatus());
		assertEquals(2002, task2.getDate().year, 0.001);
	}
	
	// test changeDate
	@Test
	public void changeDateTest() {
		task1.changeDate(15, 10, 2003);
		task2.changeDate(25, 11, 2025);
		
		assertEquals(2025, task2.getDate().year, 0.001);
		assertEquals(2003, task1.getDate().year, 0.001);
		assertEquals(11, task2.getDate().month, 0.001);
		assertEquals(10, task1.getDate().month, 0.001);
		assertEquals(25, task2.getDate().day, 0.001);
		assertEquals(15, task1.getDate().day, 0.001);
		
	}
}
