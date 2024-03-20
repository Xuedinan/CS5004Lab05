package toDoList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 */

// This is the class to create structure of Linked List

public class LinkedList<T> {

	private Node<T> data; // generic type of Node, this is what will store on the linked list
	
	// Constructor for creating linked list
	public LinkedList() {
		data = new EmptyNode();
	}
	// Constructor for creating linked list with first node
	public LinkedList(T m) {
		data = new TaskNode(m, new EmptyNode());
	}
	
	public LinkedList(Node data) {
		this.data = data;
	}
	
	// add new node to the list
	public void addNode(T m) {
		data = new TaskNode(m, data);
	}
	
	// set head as null then clear all node
	public void removeAllNode() {
		data = null;
	}
	
	// remove single node by index
	public T removeSingleNode(int position) {
		// check if position is in the range
	   if (position < 0 || position >= data.count()) {
	        throw new IllegalArgumentException ("Invalid input position for remove node");
	    }
	    return removeSingleNodeHelper(data, null, position);
	}
	
	// helper method for index removal
	private T removeSingleNodeHelper(Node<T> current, Node<T> previous, int position) {
	    // find right position to remove
	    if (position == 0) {
	        // if position is first node
	        if (previous == null) {
	            data = current.getNext(); // update head
	        } else {
	            previous.setNext(current.getNext()); // connect prev.next node with next node
	        }
	        return current.getData(); // return removed node
	    }
	    // move to next node
	    return removeSingleNodeHelper(current.getNext(), current, position - 1);
	}
	
	// print all node recursively
	public String toString() {
		return (data != null) ? data.toString() : "";
	}
	
	// get count number for all nodes on the linked list
	public int count() {
		return data.count();
	}
	
	// get node by index
	public T getNode(int position) {
		return data.getTaskNode(position);
	}
	
	// get node by condition filter recursively 
	// e.g. get HIGH status node, get expired node, etc.
	public LinkedList getNodes(Predicate<T> tester) {
		return new LinkedList(data.getStatusNodes(tester));
	}
	
	// convert node to a new LinkedList with string
	public LinkedList<String> map(Function<Task,Object> converter) {
		return new LinkedList(data.convertNodes((Function<T, Object>) converter));
	}
	
	// count node by condition filter recursively 
	public int countNodes(Predicate<T> tester) {
		return data.countNodes(tester);
	}
	// print node by condition filter recursively 
	public void printStatusNode(Predicate<T> tester) {
	  System.out.println(data.printStatusNode(tester));
	}
	
}
