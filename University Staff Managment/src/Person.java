import java.security.Principal;

public abstract class Person {

    //Person class fields
    private String name;
    private int age;


    //Person class constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter method to make the fields readable
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    //Setter methods to make the fields writable
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void displayInfo() {
        System.out.println("Person name: " + this.name +
                "\nPerson age: " + this.age);

    }


}
