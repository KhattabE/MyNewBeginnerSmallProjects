public class Employee extends Person {

    //Employee class fields
    private int employeeId;
    private String department;

    //Class constructor
    Employee(String name, int age, int employeeId, String department) {
        //Super keyword to get the superclass constructor before the subclass
        super(name, age);

        this.employeeId = employeeId;
        this.department = department;
    }

    //Getter method to make the field readable
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    //Setter method to make the fields readable
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Override the displayInfo method from the superclass
    @Override
    public void displayInfo() {
        System.out.println("Person name: " + this.getName() +
                "Person age: " + this.getAge() +
                "Person Employee ID: " + this.employeeId +
                "Person department: " + this.department);

    }


}
