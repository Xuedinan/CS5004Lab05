# CS5004Lab05
Repository for CS5004 Lab05 assignment submission

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

This week's assignment is challenging. There are many new elements that need to be integrated into my program, like filter, map, and fold. And for each method, it also has an appropriate interface/class to implement, like Predicate, Function, and Comparator. In my opinion, the extension of the previous program actually it's harder than creating a new one. I think I had this feeling that because the design of my program could be better with "Open to extend". I tried to extract the generic framework of the data structure and created multiple interfaces for different tools. However, if I redo the whole program at regaining, I think I will do more abstract design in the Task and Node class, and maybe use factory patterns to design them.

Thus, this is a great practice experience of OOD, it's like "I created trouble for myself with bad design and I need to fix it eventually". It got me a clear point of what is good design and what is good for "Open for extension, not modification".

In my program, I also apply extension as;
- Use driver and JUnit testing
- Additional functions
	- time period filter 
	- similar task checking instead of exactly same task checking
- Use more ENUM with more complex elements
- Create clear driver for testing
- More design elements, ToDoListTools, Status ENUM, Multiple interfaces
- Read / Write file with appropriate data format, could generate LinkedList automatically from reading file
- Code defensively for most of methods
- Use interface over abstract and inheritance for future extension 
