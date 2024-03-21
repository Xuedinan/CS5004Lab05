package toDoList;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// this is EmptyNode as based case for recursively checking linked list
// all functions return 0, null, "" since it's the last node on the linked list
// It implements interface Node

public class EmptyNode<T> implements Node<T>{

	@Override
	public int count() {
		return 0;
	}

	@Override
	public T getTaskNode(int position) {
		return null;
	}

	@Override
	public Node getStatusNodes(Predicate<T> tester) {
		return new EmptyNode<Object>();
	}

	public String toString() {
		return "";
	}

	@Override
	public Node removedLeftNodes(Predicate<T> tester) {
		return null;
	}

	@Override
	public Node<T> getNext() {
		return null;
	}

	@Override
	public void setNext(Node<T> next) {
	}

	@Override
	public T getData() {
		return null;
	}

	@Override
	public int countNodes(Predicate<T> tester) {
		return 0;
	}

	@Override
	public String printStatusNode(Predicate<T> tester) {
		return "";
	}

	@Override
	public StringBuilder convertNodes(Function<T, Object> converter) {
		StringBuilder result = new StringBuilder();
		return result;
	}
	
}
