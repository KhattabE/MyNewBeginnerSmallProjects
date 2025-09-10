public class Person {

    //Superclass (Person) fields
    private String name;
    private int age;



    //superclass (Person) constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getters method to make the fields readable
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


    //Setter method to make the field writeable
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }


    public void displayInfo(){
        System.out.println("Person name: " + this.name +
                "\nPerson age: " + this.age);
    }




}
