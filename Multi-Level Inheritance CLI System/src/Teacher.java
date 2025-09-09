public class Teacher extends Employee {

    //Teacher class fields
    private String subject;
    private boolean isFullTime;


    //Teacher class constructor
    Teacher(String name, int age, int employeeId, String department, String subject, boolean isFullTime) {
        //Super class constructor
        super(name, age, employeeId, department);

        this.subject = subject;
        this.isFullTime = isFullTime;

    }

    //Getter method to make the class fields readable
    public String getSubject() {
        return this.subject;
    }

    public boolean getIsFullTime() {
        return this.isFullTime;
    }

    //Setter methods to make the fields writable
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    //Overrides the displayInfo method from the superclass
    @Override
    public void displayInfo() {
        System.out.println("Person name: " + this.getName() +
                "Person age: " + this.getAge() +
                "Person Employee ID: " + this.getEmployeeId() +
                "Person department: " + this.getDepartment() +
                "Teacher subject: " + this.subject +
                "Is teacher full time?: " + isFullTime);
    }


}
