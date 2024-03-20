package toDoList;

import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileLoader {
	
	public FileLoader() {};
	
    // 从文件中读取任务并创建相应的 Task 对象
    public static LinkedList<Task> readTasksFromFile(String filePath) {
        LinkedList<Task> tasks = new LinkedList<>();
        try {
            // 创建文件读取器
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            // 逐行读取文件内容
            String line;
            while ((line = reader.readLine()) != null) {
                // 解析每一行，并创建相应的 Task 对象
                Task task = parseTaskFromString(line);
                // 将创建的 Task 对象添加到链表中
                tasks.addNode(task);
            }
            // 关闭文件读取器
            reader.close();
        } catch (IOException e) {
            // 处理异常
            e.printStackTrace();
        }
        return tasks;
    }

    // 解析字符串并创建 Task 对象的方法（示例）
    public static Task parseTaskFromString(String line) {
            // 这里假设你的任务信息是按照一定的格式保存在文件中，例如以逗号分隔
            String[] parts = line.split("\\$");
            // 假设格式为 content,date,status,priority
            
            String[] dateParts = parts[1].split("\\/");
            int day = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);
            Date date = new Date(day, month, year);
            
            String content = parts[0];
            TaskStatus status = TaskStatus.valueOf(parts[2]); // 这里假设 TaskStatus 是一个枚举类型
            PriorityType priority = PriorityType.valueOf(parts[3]); // 这里假设 PriorityType 是一个枚举类型
            
            // 创建并返回 Task 对象
            return new Task(content, date, status, priority);
    } 
    
    public static <T> void writeFile(String filePath, Task task) {

	try {	
		BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
		String str = task.content + "$" + task.date + "$" + task.status + "$" + task.priority;
		out.write(str);
		out.close();
		}
	catch(Exception e) {
		e.printStackTrace();
		}
	}

}
