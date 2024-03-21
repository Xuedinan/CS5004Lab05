package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// this is Task Class to contain all the information for each task 

public class Task {

	protected String content;
	protected Date date;
	protected TaskStatus status; // TaskStatus is ENUM 
	protected PriorityType priority; // PriorityType is ENUM
	
	// Constructor
	public Task(String content, Date date, TaskStatus status, PriorityType priority) {
		this.content = content;
		this.date = date;
		this.status = status;
		this.priority = priority;
	}
	// print information of Task
	@Override
	public String toString() {
		return "\nTask: " + content + "\nDate: " + date + "\nStatus: " + status + "\nPriority: " + priority + "\n"; 
	}
	
	// getters and setters
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TaskStatus getStatus() {
		return status;
	}
	
	// check if status is valid 
	public void setStatus(TaskStatus status) {
		if(!(status instanceof TaskStatus)) {
			throw new IllegalArgumentException("Invalid input for task status setting. ");
		}
		else {
		this.status = status;
		}
	}

	public PriorityType getPriority() {
		return priority;
	}
	
	// check if priority is valid
	public void setPriority(PriorityType priority) {
		if(!(priority instanceof PriorityType)) {
			throw new IllegalArgumentException("Invalid input for task priority setting. ");
		}
		else {
			this.priority = priority;
		}
	}
	
	// change date
	public void changeDate(int day, int month, int year) {
		// checking invalid input in Date class so no need to check here
		date.setDay(day);
		date.setMonth(month);
		date.setYear(year);
	}
}
