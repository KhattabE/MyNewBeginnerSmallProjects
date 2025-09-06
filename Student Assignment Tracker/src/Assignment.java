public class Assignment {

    //Assignment class Variables
    private String title;
    private String subject;
    private String dueDate;
    private boolean isCompleted;


    //Class constructor
    Assignment(String title, String subject, String dueDate, boolean isCompleted) {
        this.title = title;
        this.subject = subject;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    //Getter method to make the field readable
    public String getTitle() {
        return this.title;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public boolean getIsCompleted() {
        return this.isCompleted;
    }

    //Setter method to make the field writable
    void setTitle(String title) {
        this.title = title;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    String displayAssignmentInfo() {
        return "Assignment title: " + this.title + "\nAssignment subject: " + this.subject +
                "\nAssignment submission date: " + this.dueDate +
                "\nAssignment completed?: " + isCompleted;


    }


}
