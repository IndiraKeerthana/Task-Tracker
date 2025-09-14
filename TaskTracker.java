// TaskTracker.java
import java.util.ArrayList;
import java.util.Scanner;

public class TaskTracker {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        tasks.add(new Task(title, description));
        System.out.println("✅ Task added!\n");
    }

    public static void main(String[] args) {
        addTask();
    }
}
