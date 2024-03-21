package toDoList;

/*
 * Course: CS5004
 * Semester: Spring 2024
 * Assignment: Lab05
 * Name: Xuedinan Gao
 */

// this is Date Class has day, month, year. Setting year must >= 2000

public class Date {
	
	protected int day;
	protected int month;
	protected int year;
	
	// code defensively for input to create a Date object
	public Date(int day, int month, int year) {
		if(day > 31 || month > 12 || year< 2000 || day <= 0 || month <= 0 || year <= 0) {
			throw new IllegalArgumentException("Invalid day or month input");
		}
		else {
		this.day = day;
		this.month = month;
		this.year = year;
		}
	}
	// getters and setters
	public int getDay() {
		return day;
	}
	
	// set day with valid input
	public void setDay(int day) {
		if(day > 31 || day <= 0) {
			throw new IllegalArgumentException("Invalid day input");
		}
		else {
		this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}
	
	// set month with valid input
	public void setMonth(int month) {
		if(month > 12 || month <= 0) {
			throw new IllegalArgumentException("Invalid month input");
		}
		else {
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	// set year with valid input
	public void setYear(int year) {
		if(year < 2000) {
			throw new IllegalArgumentException("Invalid year input");
		}
		else {
		this.year = year;
		}
	}
	
	// print Date information
	public String toString() {
		return day + "/" + month + "/" + year; 
	}

}
