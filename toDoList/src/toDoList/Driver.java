package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 * 
 * This is main driver to demonstrate this program
 */

/* 
My program has structure as below;

	ENUM
		- TaskStatus, ONGOING, COMPLETED
		- PriorityType, HIGH, GENERAL, LOW
		
	Date Class
		- subclass, ExpiredDate Class
	
	Node Interface
		- Implementation class, TaskNode
		- Implementation class, EmptyNode
	
	LinkedList Class
		- main structure for linked list
	
	Task Class
		- store information for each task
	
	ToDoListTools Class
		- provide checking tools when filter out task

Demonstration process;

	1.create LinkedList, Task, date, ExpiredDate object with valid, and invalid input
	2.add more task
	3.remove single task
	4.count all task
	5.get task by condition
	6.remove task by condition
	7.print out task by condition
	8.print in period task
	9.change date on task
	10.count all task by condition
	11.print similar content task
	12.remove all task
	13.print all task
*/

public class Driver {
	
	public static void main(String[] args) {
		
		// create objects
		LinkedList<Task> ll = new LinkedList<Task>();
		
		Date date1 = new Date(1, 3, 2005);
		Task task1 = new Task("Coding JAVA", date1, TaskStatus.COMPLETED, PriorityType.HIGH);
		Date date2 = new Date(10, 12, 2022);
		Task task2 = new Task("Sleeping", date2, TaskStatus.ONGOING, PriorityType.HIGH);
		Date date3 = new Date(8, 5, 2014);
		Task task3 = new Task("Eating", date3, TaskStatus.ONGOING, PriorityType.LOW);
		Date date4 = new Date(1, 3, 2015);
		Task task4 = new Task("Coding Python", date1, TaskStatus.COMPLETED, PriorityType.HIGH);
		
		// set expiration date
		ExpiredDate exDate = new ExpiredDate(1, 3, 2022);
		ExpiredDate psDate = new ExpiredDate(1, 3, 2014);
		
		// for similar content task check later
		String contentCheck = "Coding"; 
		
		// create filter tool
		ToDoListTools filter = new ToDoListTools();
		
		System.out.println(" --- Program testing started ---");
		System.out.println("We have nothing to do right now" + ll.toString());
		System.out.println("\n--- Added tasks to the list ---");
		
		ll.addNode(task1);
		ll.addNode(task2);
		ll.addNode(task3);
		ll.addNode(task4);
		
		System.out.println("\n--- ============= ---");
		LinkedList<String> test11 = ll.map(s->s.getContent());
		System.out.println(test11.toString());
		

		System.out.println("Now we have tasks: \n" + ll.toString());
		System.out.println("Total " + ll.count() + " tasks to do. ");
		System.out.println(" \n--- Don't want to eat, remove Eating ---");
		ll.removeSingleNode(1);
		
		System.out.println("Now we have tasks: \n" + ll.toString());
		System.out.println("--- Revise Eating to Dancing, change date and add it back. ---");
		
		task3.setContent("Dancing");
		task3.changeDate(1, 10, 2015);
		ll.addNode(task3);
		System.out.println("Now we have tasks: \n" + ll.toString());
		
		System.out.println("\n--- Get all onging tasks ---");
		LinkedList<Task> ongoingTask = ll.getNodes(filter.statusCheck(TaskStatus.ONGOING));
		System.out.println("Now we have on going tasks: \n" + ongoingTask.toString());
		
		System.out.println("\n--- Get all high prioirty tasks ---");
		LinkedList<Task> highTask = ll.getNodes(filter.priorityCheck(PriorityType.HIGH));
		System.out.println("Now we have high prioirty tasks: \n" + highTask.toString());
		
		System.out.println("\n--- Get all expired tasks ---");
		LinkedList<Task> expiredTask = ll.getNodes(filter.expireCheck(exDate));
		System.out.println("Now we have expired tasks, before expired date: " + exDate.toString()+"\n" + expiredTask.toString());
		
		System.out.println("\n--- Print out all task between two expired date ---");
		System.out.println("Start date: " + exDate.toString());
		System.out.println("End date: " + psDate.toString());
		LinkedList<Task> periodTask = ll.getNodes(filter.datePeriodCheck(psDate, exDate));
		System.out.println("Now we have below tasks: \n" + periodTask.toString());
		
		System.out.println("\n--- Count tasks only has HIGH prioirty ---");
		int ht = ll.countNodes(filter.priorityCheck(PriorityType.HIGH));
		System.out.println("Now we have " + ht + " HIGH priority tasks \n");
		
		System.out.println("\n--- Get similar tasks ---");
		LinkedList<Task> simlarTask = ll.getNodes(filter.contentCheck(contentCheck));
		System.out.println("Now we have task with simlar content of " + contentCheck + "\n" + simlarTask.toString());
		
		System.out.println("--- Remove all tasks ---");
		ll.removeAllNode();
		System.out.println("\nNow list is empty" + ll.toString());
	}
}
