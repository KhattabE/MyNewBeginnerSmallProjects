public class Teacher extends Employee implements Payable {

    //Teacher class fields
    private String subject;
    private boolean isFullTime;

    //Teacher class constructor
    Teacher(String name, int age, String department, double baseSalary, String subject, boolean isFullTime) {

        //The super keyword to get the constructor details from the super class (Person class)
        super(name, age, department, baseSalary);

        this.subject = subject;
        this.isFullTime = isFullTime;

    }


    //Getter method to make the field readable
    public String getSubject() {
        return this.subject;
    }

    public boolean getIsFullTime() {
        return this.isFullTime;
    }


    //Setter method to make the class fields writable
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }


    //Implements and overrides the Payable interface class method
    @Override
    public double calculateSalary() {

        if (this.isFullTime) {
            return getBaseSalary() * 1.2;
        } else {
            return getBaseSalary() * 0.6;
        }
    }

    //Overrides the displayInfo from the employee class
    @Override
    public void displayInfo(){
        System.out.println("Person name: " + this.getName() +
                "\nPerson age: " + this.getAge() +
                "\nPerson department: " + this.getDepartment() +
                "\nThe base salary: " + this.getName() +
                "\nTeacher subject: " + this.subject +
                "\nIs teacher full time?: " + this.isFullTime);
    }

}
