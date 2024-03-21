package toDoList;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This is node interface has framework for TaskNode and EmptyNode, open to extend for future 

public interface Node<T> {
	
	public int count();
	
	public T getTaskNode(int position);
	
	public Node<?> getStatusNodes(Predicate<T> tester);

	public Node<?> removedLeftNodes(Predicate<T> tester);

	public Node<T> getNext();

	public void setNext(Node<T> next);

	public T getData();

	public int countNodes(Predicate<T> tester);

	public String printStatusNode(Predicate<T> tester);

	public StringBuilder convertNodes(Function<T, Object> converter);

}
