package toDoList;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 */

// This is tool class, using for filtering out task with status, priority, date, content
// all methods return boolean by using predicate interface

public class FilterTool {
	
	// constructor to create filter tool
	public FilterTool() {};
	
	// checking for expiration date
    public Predicate<Task> expireCheck(ExpiredDate date) {
        return task -> date.isBefore(task.getDate());
    }
	
    // checking for task status
    public Predicate<Task> statusCheck(TaskStatus status) {
        return task -> task.getStatus() == status;
    }
    
    // checking for priority level
    public Predicate<Task> priorityCheck(PriorityType priority) {
        return task -> task.getPriority() == priority;
    }
    
    // checking for same task
    public Predicate<Task> contentCheck(String content) {
        return task -> task.getContent().contains(content);
    }
    
    // provide period tasks
    public Predicate<Task> datePeriodCheck(ExpiredDate start, ExpiredDate end) {
        return task -> end.isBefore(task.getDate()) && start.isAfter(task.getDate());
    }
    
}
