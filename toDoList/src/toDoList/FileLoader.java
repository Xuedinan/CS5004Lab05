package toDoList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// This is the class to help read task from file to create linked list and write task into file with correct format

public class FileLoader {
	
	public FileLoader() {};
	
    // read content from input file
    public static LinkedList<Task> readTasksFromFile(String filePath) {
        LinkedList<Task> tasks = new LinkedList<>();
        try {
            // create a reader object
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            // read content line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // make parts of each line and pass to task creater function
                Task task = stringParts(line);
                // add task to linked list
                tasks.addNode(task);
            }
	            // close reader
	            reader.close();
	        } catch (IOException e) {
	            // handle exception
	            e.printStackTrace();
	        }
	        return tasks;
	    }

    // helper function to make string to parts to match task constructor
    public static Task stringParts(String line) {
    		// split string to different parts
            String[] parts = line.split("\\$");
            
            // split date string to match date constructor
            String[] dateParts = parts[1].split("\\/");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
            Date date = new Date(day, month, year);
            
            // pass information to content, task status, and priority type
            String content = parts[0];
            TaskStatus status = TaskStatus.valueOf(parts[2]);
            PriorityType priority = PriorityType.valueOf(parts[3]);
            
            // create Task object
            return new Task(content, date, status, priority);
    } 
    
    // take Task and follow data format to write on file
    public static <T> void writeFile(String filePath, Task task) {
		try {
			// create a reader object
			BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
			// split string into file data format
			String str = task.content + "$" + task.date + "$" + task.status + "$" + task.priority;
			// write into file then close
			out.write(str);
			out.close();
			}
		catch(Exception e) {
			// handle exception
			e.printStackTrace();
			}
		}
}
