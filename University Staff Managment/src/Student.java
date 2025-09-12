public class Student extends Person{

    //Student class fields
    private String major;
    private int yearLevel;
    private double gpa;


    //Student class constructor
    Student(String name, int age, String major, int yearLevel, double gpa){

        //Super keyword to get the info and details to the super class constructor
        super(name, age);

        this.major = major;
        this.yearLevel = yearLevel;
        this.gpa = gpa;
    }
    

    //Getter methods to make the class fields readable
    public String getMajor(){
        return this.major;
    }

    public int getYearLevel(){
        return this.yearLevel;
    }

    public double getGpa(){
        return this.gpa;
    }

    //Setter methods to make the class fields writable
    public void setMajor(String major){
        this.major = major;
    }

    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }


    //Override the displayInfo from the parent class (Person class)
    @Override
    public void displayInfo(){
        System.out.println("Person name: " + this.getName() +
                "\nPerson age: " + this.getAge() +
                "\nStudent major: " + this.major +
                "\nPerson year level: " + this.yearLevel +
                "\nPerson gpa: " + this.gpa);
    }





}
