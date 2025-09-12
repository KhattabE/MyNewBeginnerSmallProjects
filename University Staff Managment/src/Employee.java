public class Employee extends Person {

    //Employee class fields
    private String department;
    private double baseSalary;


    //Employee class constructor
    Employee(String name, int age, String department, double baseSalary) {
        //Super keyword to get the superclasses constructor infos
        super(name, age);

        this.department = department;
        this.baseSalary = baseSalary;
    }



    //Getter to make the class fields readable
    public String getDepartment() {
        return this.department;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }


    //Setter methods to make the class fields writable
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    //Override the method from the super class(Person class)
    @Override
    public void displayInfo(){
        System.out.println("Person name: " + this.getName() +
                "\nPerson age: " + this.getAge() +
                "\nPerson department: " + this.department +
                "\nThe base salary: " + this.baseSalary);
    }




}
