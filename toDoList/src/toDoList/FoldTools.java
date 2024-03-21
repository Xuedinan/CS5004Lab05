package toDoList;

import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This Interface for class to implements count tool function for folding

public interface FoldTools<T> {
	
	int FoldCountByStatus(LinkedList<?> ll, Predicate<?> tester);

}
