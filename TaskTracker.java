// TaskTracker.java
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTracker {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    //Adding tasks
    public static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(title, description));
        System.out.println("Task added!\n");
    }
    //View tasks
    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
            return;
        }
        System.out.println("All Tasks:");
        
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + tasks.get(i));
        }
        System.out.println();
    }
    //complete task
    public static void completeTask() {
        viewTasks();
        System.out.print("Enter task number to mark as complete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Task marked as complete!\n");
        } else {
            System.out.println("Invalid task number.\n");
        }
    }
    //delete task
    public static void deleteTask() {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted!\n");
        } else {
            System.out.println("Invalid task number.\n");
        }
    }
    
}

