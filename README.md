# CS5004Lab05
Repository for CS5004 Lab05 assignment submission

Name: Xuedinan(Dinan) Gao\
Semester: 2024 Spring

### My submission includes following directory/files

- program\
![image](https://github.com/Xuedinan/CS5004Lab05/assets/144306521/ce375fa4-0d49-4735-8cbc-4e76d01da63d)

- test\
![image](https://github.com/Xuedinan/CS5004Lab05/assets/144306521/eac86e0f-83fa-451d-af65-9d30d615889f)

### My program has the structure as below;

- ENUM
	- TaskStatus, ONGOING, COMPLETED
	- PriorityType, HIGH, INPROGRESS, LOW
	
- Date Class
	- subclass, ExpiredDate Class

- Node Interface
	- Implementation class, TaskNode
	- Implementation class, EmptyNode

- LinkedList Class
	- main structure for linked list

- Task Class
	- store information for each task

- ToDoListTools Class
	- provide checking tools for filtering, mapping, folding method

	- Implements -> FilterMapTools Interface
					- provide interface for filter, map method
					
	- Implements -> FoldTools Interface
					- provide interface for count fold method
- TaskCompare Class
	- Compare two tasks for priority
	
- FileLoader Class
	- Provide tool to create Linked List by reading tasks from a file
	- Provide tool to write tasks into a file with format
 
### Driver test process
1. create LinkedList, Task, date, ExpiredDate object with valid, and invalid input
2. add more task
3. remove single task
4. count all task
5. revise task and date
5. get task by condition
6. remove task by condition
7. print out task by condition
8. print in period task
9. change date on task
10. count task by MAP and Filter method
11. get tasks and create Linked List from reading file
12. compare tasks and get higher priority one
13. print similar content task
14. implement MAP to convert linked list to cotent only linked list
15. remove all task
16. print all task

### Writing assignment

:star:  **Weekly report**

This week's assignment is challenging. There are many new elements that need to be integrated into my program, like filter, map, and fold. And for each method, it also has an appropriate interface/class to implement, like Predicate, Function, and Comparator. In my opinion, the extension of the previous program actually it's harder than creating a new one. I think I had this feeling that because the design of my program could be better with "Open to extend". I tried to extract the generic framework of the data structure and created multiple interfaces for different tools. However, if I redo the whole program at regaining, I think I will do more abstract design in the Task and Node class, and maybe use factory patterns to design them.

Thus, this is a great practice experience of OOD, it's like "I created trouble for myself with bad design and I need to fix it eventually". It got me a clear point of what is good design and what is good for "Open for extension, not modification".

In my program, I also apply extension as;
- Use driver and JUnit testing
- Additional functions
	- time period filter 
	- similar task checking instead of exactly same task checking
 	- implements count function by both of fold and filter method
- Use more ENUM with more complex elements
- Create clear driver for testing
- More design elements, ToDoListTools, Status ENUM, Multiple interfaces
- Read / Write file with appropriate data format, could generate LinkedList automatically from reading file
- Code defensively for most of methods
- Use interface over abstract and inheritance for future extension 
