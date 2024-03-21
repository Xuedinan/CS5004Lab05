package toDoList;

import java.util.function.Function;
import java.util.function.Predicate;
/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This is tool class, using for 
// filtering - task with status, priority, date, content
// mapping - convert linked list to string linked list
// folding - count by input requirement
// all methods return boolean by using predicate interface


public class ToDoListTools implements FilterMapTools<Task, Object>, FoldTools<Object>{
	
	public ToDoListTools() {};
	
	// checking for expiration date
	@Override
    public Predicate<Task> expireCheck(ExpiredDate date) {
        return task -> date.isBefore(task.getDate());
    }
    
	// checking for task status
	@Override
	public Predicate<Task> statusCheck(TaskStatus status) {
        return task -> task.getStatus() == status;
    }
    
    // checking for priority level
	@Override
	public Predicate<Task> priorityCheck(PriorityType priority) {
        return task -> task.getPriority() == priority;
    }
    
	/* I'm using contatins() instead of equals() to check same task
	 * Because while we using ToDo list tool, most of the time, we might have similar tasks instead of exactly the same
	 * task has the same string content.
	 */
	
    // checking for same task
	@Override
	public Predicate<Task> contentCheck(String content) {
        return task -> task.getContent().contains(content);
    }
    
    // provide period tasks
	@Override
	public Predicate<Task> datePeriodCheck(ExpiredDate start, ExpiredDate end) {
        return task -> end.isBefore(task.getDate()) && start.isAfter(task.getDate());
    }
	
	// convert linked list to string linked list
    @Override
    public String stringMap(Function<Task, Object> converter) {   
    	String content = converter.toString();
    	return content;
    }
    
    //fold - get count number by input checking
    @Override
	public int FoldCountByStatus(LinkedList ll, Predicate tester) {
		
		int result = ll.countNodes(tester);
		return result;
	}
	
}
