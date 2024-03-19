# CS5004Lab05
Repository for CS5004 Lab04 assignment submission

Name: Xuedinan(Dinan) Gao\
Semester: 2024 Spring

### My submission includes following directory/files

- program\
  <img width="306" alt="image" src="https://github.com/Xuedinan/CS5004Lab04/assets/144306521/dcceee04-1dd9-4b2a-97fe-d7f8dd0f5417">


- test
<img width="201" alt="image" src="https://github.com/Xuedinan/CS5004Lab04/assets/144306521/df7e7036-f73a-4995-8820-6a5527b6d1fa">


### My program has the structure as below;

- ENUM
	- TaskStatus, ONGOING, COMPLETED
	- PriorityType, HIGH, GENERAL, LOW
- Date Class
	- subclass, ExpiredDate Class
- Node Interface
	- Implementation class, TaskNode
	- Implementation class, EmptyNode
- LinkedList Class
	- main structure for linked list
- Task Class
	- store information for each task
- FilterTool Class
	- provide checking tools when filter out task
 
### Driver test process
1. create LinkedList, Task, date, ExpiredDate object with valid, and invalid input
2. add more task
3. remove single task
4. count all task
5. get task by condition
6. remove task by condition
7. print out task by condition
8. print in period task
9. change date on task
10. count all task by condition
11. print similar content task
12. remove all task
13. print all task

### Writing assignment

:star:  **Weekly report**

By completing Lab Assignment 04, I'm familiar with LinkedList and practice a lot of implementation. In addition, since this is an open design assignment, I also try to add more OOD design principles to my assignment, like using more ENUM, Interface, Abstract Class, extracting generic function to a tool class, making my program more abstract and friendly to extension in the future, etc.

For the Linked List data structure, I think it's really great for the design that needs a dynamic size of data structure and is easy to insert and delete. Like this assignment, by using Linked List, we could quickly access the head of all tasks and help us with quick updating and modification, and it saved more memory by utilizing the non-continuous memory of the computer. However, I think this assignment is also achievable without using Linked List, we could implement an array or tree structure but might have different time and space complexity based on our operation design of this program.

In my program, I also apply extension as;
- Use driver and JUnit testing
- Additional functions
	- time period filter 
	- similar task checking
- Use more ENUM with more complex elements
- Create clear driver for testing
- More design element, FilterTool, Status ENUM, prepare to extend
- Code defensively for most of methods
- Use interface over abstract and inheritance for future extension 
