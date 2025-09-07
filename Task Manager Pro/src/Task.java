public class Task {

    //Class variables (Set to private for encapsulation)
    private String title;
    private String dueDate;
    private String priority;
    private boolean isCompleted;


    //Task class constructor
    Task(String title, String dueDate, String priority, boolean isCompleted) {
        this.title = title;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = isCompleted;

    }

    //Getter method to make the fields readable
    public String getTitle() {
        return this.title;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public String getPriority() {
        return this.priority;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    //Setter methods to make the fields writable
    void setTitle(String title) {
        this.title = title;
    }

    void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    void setPriority(String priority) {
        this.priority = priority;
    }

    void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }


    //toString method
    public String toString(){
        return "Task title: " + this.title +
                "\nTask due date: " + this.dueDate +
                "\nTask priority; " + this.priority +
                "\nIs the task completed?: " + this.isCompleted;
    }


}
