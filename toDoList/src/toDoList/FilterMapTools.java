package toDoList;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This Interface for class to implements related tool function for filtering, mapping

public interface FilterMapTools<T, R> {
	
	// Filter tools
	
	// checking for expiration date
	Predicate<T> expireCheck(ExpiredDate date);
	
    // checking for task status
	Predicate<T> statusCheck(TaskStatus status);
    
    // checking for priority level
	Predicate<T> priorityCheck(PriorityType priority);
    
    // checking for same task
	Predicate<T> contentCheck(String content);
    
    // provide period tasks
	Predicate<T> datePeriodCheck(ExpiredDate start, ExpiredDate end);
	
	// Map tools
	
	// covert list to task description list
	String stringMap(Function<T,R> converter);
	
	
}
