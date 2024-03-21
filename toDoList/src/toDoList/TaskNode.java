package toDoList;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// this is TaskNode contains all the information for each node on the linked list
// It implements interface Node

public class TaskNode<T> implements Node<T> {

	private T data;
	private Node nextTask; // pointer to the next node
	
	// construct a TaskNode with next node to apply to linked list structure
	public TaskNode(T data, Node nextTask) {
		this.data = data;
		this.nextTask = nextTask;
	}
	
	// getters and setters
	public T getData(){
		return data;
	}
	
	public Node<T> getNext(){
		return nextTask;
	}
	
	public void setNext(Node<T> nextTask) {
		this.nextTask = nextTask;
	}
	
	// count total TaskNode created
	@Override
	public int count() {
		return 1+ nextTask.count();
	}
	
	// pint current and next node
	public String toString() {
		return data.toString() + nextTask.toString();
	}
	
	// get task by input index
	@Override
	public T getTaskNode(int position) {
		if(position == 0) {
			return (T) data.toString();
		}
		
		return (T) nextTask.getTaskNode(--position);
	}
	
	// get task by condition check, will using Predicate interface and FilterTool class when implemented
	@Override
	public Node getStatusNodes(Predicate<T> tester) {
		if(tester.test(data)) {
			return new TaskNode(data, nextTask.getStatusNodes(tester));
		}
		else {
			return nextTask.getStatusNodes(tester); // recursively check each node
		}
	}
	
	// remove task by condition check, only return what left after removed
	// will using Predicate interface and FilterTool class when implemented
	@Override
	public Node removedLeftNodes(Predicate<T> tester) {
		if(!tester.test(data)){
			return new TaskNode(data, nextTask.removedLeftNodes(tester));
		}
		else {
			return nextTask.removedLeftNodes(tester); // recursively check each node
		}
	}
	
	// count number of tasks by selected check
	// e.g. count task with HIGH priority, count task with ONGOING status
	// will using Predicate interface and FilterTool class when implemented
	@Override
	public int countNodes(Predicate<T> tester) {
		//counter variable
	    int counter = 0;
	    // if found it add 1 to counter
	    if (tester.test(data)) {
	        counter++;
	    }
	    // keep checking next one
	    if (nextTask != null) {
	        counter += nextTask.countNodes(tester);
	    }
	    return counter;
	}
	
	// print tasks by selected check
	// e.g. print task with HIGH priority, print task with ONGOING status
	// will using Predicate interface and FilterTool class when implemented
	public String printStatusNode(Predicate<T> tester) {
		// create StringBuilder to receive result
	    StringBuilder result = new StringBuilder();
	    
	    // add qualified task
	    if (tester.test(data)) {
	        result.append(data.toString()).append("\n");
	    }
	    // keep checking next one
	    if (nextTask != null) {
	        result.append(nextTask.printStatusNode(tester));
	    }
	    return result.toString();
	}
	
	// Map tool, convert whole Linked List to a Linked List with a linked list with task description only
	public StringBuilder convertNodes (Function<T, Object> converter){
		// create StringBuilder to receive result
	    StringBuilder result = new StringBuilder();
	    result.append((String) converter.apply(data)).append("\n");
	    if (nextTask != null) { // check next node
	        result.append(nextTask.convertNodes(converter)).append("\n"); // recusively loop nextTask
	    }
	    return result;
	}
	
}
