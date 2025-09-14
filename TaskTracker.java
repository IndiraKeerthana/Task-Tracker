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

    public static void main(String[] args) {
        addTask();
        viewTasks(); 
    }
}
