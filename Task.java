// Task.java
public class Task {
    private String title;
    private String description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void markComplete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[✓] " : "[ ] ") + title + ": " + description;
    }
}