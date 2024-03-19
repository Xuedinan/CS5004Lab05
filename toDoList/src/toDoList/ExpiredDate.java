package toDoList;
import java.util.function.Predicate;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab04
 * Name: Xuedinan Gao
 */

// ExpriedDate Class for manipulating the task when requires time sensitive
// It extends Date Class

public class ExpiredDate extends Date{

	public ExpiredDate(int day, int month, int year) {
		super(day, month, year);
	}
	
	// checking if task.date is before expired date
	// this method will be implemented in FilterTool Class
    public boolean isBefore(Date taskDate) {
        // get task date
        int taskDay = taskDate.getDay();
        int taskMonth = taskDate.getMonth();
        int taskYear = taskDate.getYear();
        
        // compare expired date with task date
        if (taskYear < year) {
            return true;
        } else if (taskYear == year && taskMonth < month) {
            return true;
        } else if (taskYear == year && taskMonth == month && taskDay < day) {
            return true;
        } else {
            return false;
        }
    }
   
	// checking if task.date is after expired date
    // this method will be implemented in FilterTool Class
    public boolean isAfter(Date taskDate) {
        // get task date
        int taskDay = taskDate.getDay();
        int taskMonth = taskDate.getMonth();
        int taskYear = taskDate.getYear();
        
        // compare expired date with task date
        if (taskYear > year) {
            return true;
        } else if (taskYear == year && taskMonth > month) {
            return true;
        } else if (taskYear == year && taskMonth == month && taskDay > day) {
            return true;
        } else {
            return false;
        }
    }
}
