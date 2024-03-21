package toDoList;

import java.util.Comparator;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This a tool class to help compare priority between tasks

public class TaskCompare implements Comparator<Task>{
	
	@Override
	public int compare(Task t1, Task t2) {
		int result = t2.getPriority().compareTo(t1.getPriority());
		return result;
	}
	
	// return compare result
	public String compareResult(Task t1, Task t2) {
		int flag = compare(t1, t2);
		if(flag > 0) {
			return t1.getContent() + " has higher prioirty";
		}
		else if(flag == 0) {
			return t1.getContent() + " and" + t2.getContent() + " has same prioirty";
		}
		else {
			return t2.getContent() + " has higher prioirty";
		}
	}
}