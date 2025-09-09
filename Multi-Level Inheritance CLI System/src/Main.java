import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Arraylist to contain teacher info
    ArrayList<Teacher> teachers = new ArrayList<>();


    public static void main(String[] args) {

        //To avoid needing to use static, and to make the project more oop
        Main app = new Main();

        //Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        //Method calling mainMenu
        app.mainMenu(scanner);


    }


    void mainMenu(Scanner scanner) {

        System.out.println("----------------------------------------------------------------------");
        //Welcomes message
        System.out.println("Welcome to the Teacher Management System!");

        //Asks user their name, before being able to enter the system
        System.out.print("Enter your name to continue: ");
        String userName = scanner.nextLine();

        while (userName.trim().isEmpty()) {
            System.out.print("Enter valid name!: ");
            userName = scanner.nextLine();
        }

        System.out.println("Welcome " + userName + "!");
        System.out.println("----------------------------------------------------------------------");

        //This variable will be used for menu choice
        int optionChoice = -1;

        while (optionChoice < 1 || optionChoice > 5) {
            System.out.println("You got the following options: ");
            System.out.println("1: Add a teacher");
            System.out.println("2: View all Teachers");
            System.out.println("3: Search teacher by ID");
            System.out.println("4: Count teachers by subject");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            //Scanner for user choicer
            optionChoice = scanner.nextInt();
            //removes new line
            scanner.nextLine();
            System.out.println("----------------------------------------------------------------------");
        }

        //While loop to be able to keep looping through the menu, as long as user does not enter 5(For Exit)
        while (optionChoice != 5) {

            //Switch case that will take effect based on the user input
            switch (optionChoice) {

                case 1 -> addTeacher(scanner);


            }
        }
    }


    //Method that contains the code to add teacher
    public void addTeacher(Scanner scanner){

        System.out.println("----------------------------------------------------------------------");
        //Asks to add teacher name
        System.out.print("Add teacher name: ");
        String teacherName = scanner.nextLine();

        //While loop to make sure the user enters something
        while(teacherName.trim().isEmpty()){
            System.out.print("Add a valid Teacher name!: ");
            teacherName = scanner.nextLine();
        }
        System.out.println(teacherName + " has been added");
        System.out.println("----------------------------------------------------------------------");


        //Asks to add teacher age
        System.out.print("Add teacher age: ");
        int teacherAge = scanner.nextInt();

        //While loop to make sure the user does not pick an age under 18
        while(teacherAge < 18){
            System.out.println("No teacher is under the age of 18!");
            System.out.print("Enter a valid age(18+)!: ");
            teacherAge = scanner.nextInt();
        }

        System.out.println(teacherAge + " has been added");
        scanner.nextLine();
        System.out.println("----------------------------------------------------------------------");


        //Asks for ID
        System.out.print("Enter teacher ID: ");
        int teacherID = scanner.nextInt();

        //While loop to make sure the user cant use negativ numbers
        while(teacherID < 0){
            System.out.println("ID CAN NOT BE NEGATIVE!");
            System.out.print("Enter a valid ID!: ");
            teacherID = scanner.nextInt();
        }

        System.out.println(teacherID + " has been added");
        scanner.nextLine();
        System.out.println("----------------------------------------------------------------------");

        //Asks for department
        System.out.print("Enter teacher department: ");
        String teacherDepartment = scanner.nextLine();

        //While loop to make sure user dont enter nothing
        while(teacherDepartment.trim().isEmpty()){
            System.out.print("Enter a valid department!: ");
            teacherDepartment = scanner.nextLine();
        }

        System.out.println(teacherDepartment + " has been added");
        System.out.println("----------------------------------------------------------------------");

        //Asks for teacher subject
        System.out.print("Enter teacher subject: ");
        String teacherSubject = scanner.nextLine();

        //While loop to make sure user dont enter nothing
        while(teacherSubject.trim().isEmpty()){
            System.out.print("Enter a valid subject!: ");
            teacherSubject = scanner.nextLine();

        }

        System.out.println(teacherSubject + " has been added");
        System.out.println("----------------------------------------------------------------------");

        //Asks if the teacher is full time
        boolean teacherIsFullTime = false;
        System.out.print("Is teacher full time?(Yes/No): ");
        String isTeacherFullTime = scanner.nextLine();

        while(!isTeacherFullTime.equalsIgnoreCase("Yes") && !isTeacherFullTime.equalsIgnoreCase("No")){
            System.out.print("Enter valid choice(Yes/No)!: ");
            isTeacherFullTime = scanner.nextLine();
        }

        if(isTeacherFullTime.equalsIgnoreCase("Yes")){
            teacherIsFullTime = true;
            System.out.println("Teacher is full time");
        } else if (isTeacherFullTime.equalsIgnoreCase("No")) {
            System.out.println("Teacher is not full time");

        }

        Teacher teacherArray = new Teacher(teacherName, teacherAge, teacherID, teacherDepartment, teacherSubject,  teacherIsFullTime);
        teachers.add(teacherArray);


    }






}
