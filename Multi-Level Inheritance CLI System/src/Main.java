import java.util.ArrayList;
import java.util.InputMismatchException;
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

        //While loop to be able to keep looping through the menu, as long as user does not enter 5(For Exit)
        while (optionChoice != 5) {
            //Try catch, for exception handling (InputMismatchException), so only integers are allowed
            try {
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


                //Switch case that will take effect based on the user input
                switch (optionChoice) {

                    case 1 -> addTeacher(scanner);

                    case 2 -> viewAllTeachers();

                    case 3 -> searchTeacherByID(scanner);

                    case 4 -> CountTeachersBySubject(scanner);

                    case 5 -> System.exit(0);


                }

                optionChoice = -1;

            } catch (InputMismatchException ime) {
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Only integers allowed!");
                System.out.println("----------------------------------------------------------------------");
                //Clears new line
                scanner.nextLine();
            }

        }
    }


    //Method that contains the code to add teacher
    public void addTeacher(Scanner scanner) {

        System.out.println("----------------------------------------------------------------------");
        //Asks to add teacher name
        System.out.print("Add teacher name: ");
        String teacherName = scanner.nextLine();

        //While loop to make sure the user enters something
        while (teacherName.trim().isEmpty()) {
            System.out.print("Add a valid Teacher name!: ");
            teacherName = scanner.nextLine();
        }
        System.out.println(teacherName + " has been added");
        System.out.println("----------------------------------------------------------------------");


        //Asks to add teacher age
        //TeacherAge has a value of 0 to begin with, so the variable can works inside the try catch block
        int teacherAge = 0;
        //A variable of data type boolean, sat to false. will be used to break out of the while loop, when isValid = false
        boolean isValid = false;
        //
        while (!isValid) {
            try {
                //isValid is sat to true, because the while loop says !isValid (which is true since isValid is sat to false before)
                isValid = true;
                System.out.print("Add teacher age: ");
                teacherAge = scanner.nextInt();

                //While loop to make sure the user does not pick an age under 18
                while (teacherAge < 18) {
                    System.out.println("No teacher is under the age of 18!");
                    System.out.print("Enter a valid age(18+)!: ");
                    teacherAge = scanner.nextInt();
                }

                System.out.println(teacherAge + " has been added");
                scanner.nextLine();
                System.out.println("----------------------------------------------------------------------");

            } catch (InputMismatchException ime) {
                System.out.println("Age can only be integer!");
                //Clear new line
                scanner.nextLine();
                isValid = false;
            }
        }


        //TeacherID has a value of 0 to begin with, so the variable can works inside the try catch block
        int teacherID = 0;
        boolean idIsValid = false;
        while (!idIsValid) {
            try {
                idIsValid = true;
                //Asks for ID
                System.out.print("Enter teacher ID: ");
                teacherID = scanner.nextInt();

                //While loop to make sure the user cant use negativ numbers
                while (teacherID < 0) {
                    System.out.println("ID CAN NOT BE NEGATIVE!");
                    System.out.print("Enter a valid ID!: ");
                    teacherID = scanner.nextInt();
                }

                System.out.println(teacherID + " has been added");
                scanner.nextLine();
                System.out.println("----------------------------------------------------------------------");

            }catch (InputMismatchException ime){
                System.out.println("ID ONLY ALLOWS INTEGER!");
                //Clears new line
                scanner.nextLine();
                idIsValid = false;

            }
        }


        //Asks for department
        System.out.print("Enter teacher department: ");
        String teacherDepartment = scanner.nextLine();

        //While loop to make sure user dont enter nothing
        while (teacherDepartment.trim().isEmpty()) {
            System.out.print("Enter a valid department!: ");
            teacherDepartment = scanner.nextLine();
        }

        System.out.println(teacherDepartment + " has been added");
        System.out.println("----------------------------------------------------------------------");

        //Asks for teacher subject
        System.out.print("Enter teacher subject: ");
        String teacherSubject = scanner.nextLine();

        //While loop to make sure user dont enter nothing
        while (teacherSubject.trim().isEmpty()) {
            System.out.print("Enter a valid subject!: ");
            teacherSubject = scanner.nextLine();

        }

        System.out.println(teacherSubject + " has been added");
        System.out.println("----------------------------------------------------------------------");

        //Asks if the teacher is full time
        boolean teacherIsFullTime = false;
        System.out.print("Is teacher full time?(Yes/No): ");
        String isTeacherFullTime = scanner.nextLine();

        while (!isTeacherFullTime.equalsIgnoreCase("Yes") && !isTeacherFullTime.equalsIgnoreCase("No")) {
            System.out.print("Enter valid choice(Yes/No)!: ");
            isTeacherFullTime = scanner.nextLine();
        }

        if (isTeacherFullTime.equalsIgnoreCase("Yes")) {
            teacherIsFullTime = true;
            System.out.println("Teacher is full time");
        } else if (isTeacherFullTime.equalsIgnoreCase("No")) {
            System.out.println("Teacher is not full time");

        }
        System.out.println("----------------------------------------------------------------------");

        Teacher teacherArray = new Teacher(teacherName, teacherAge, teacherID, teacherDepartment, teacherSubject, teacherIsFullTime);
        teachers.add(teacherArray);


    }

    public void viewAllTeachers() {

        if (teachers.isEmpty()) {
            System.out.println("THE LIST IS EMPTY!");
            System.out.println("----------------------------------------------------------------------");
        } else

            for (Teacher t : teachers) {
                t.displayInfo();
            }
        System.out.println("----------------------------------------------------------------------");
    }


    public void searchTeacherByID(Scanner scanner) {
        //An if statement to check if the list is empty, if it is, it will take the user back to the main menu, else it will move on to the next step
        if (teachers.isEmpty()) {
            System.out.println("THE LIST IS EMPTY!");
            System.out.println("----------------------------------------------------------------------");

        } else {

            System.out.println("----------------------------------------------------------------------");
            System.out.print("Enter the ID of the teacher: ");
            int teacherSearchID = scanner.nextInt();
            scanner.nextLine();

            //A while loop to make sure the user cant enter negativ numbers
            while (teacherSearchID < 0) {
                System.out.println("No negative numbered ID!");
                System.out.print("Enter valid ID: ");
                teacherSearchID = scanner.nextInt();
                System.out.println("----------------------------------------------------------------------");
            }

            boolean isFound = false;
            //
            for (int i = 0; i < teachers.size(); i++) {
                if (teacherSearchID == teachers.get(i).getEmployeeId()) {
                    isFound = true;
                    teachers.get(i).displayInfo();
                    System.out.println("----------------------------------------------------------------------");
                } else {
                    System.out.println("TEACHER NOT FOUND IN THE LIST!");
                    System.out.println("----------------------------------------------------------------------");
                }

            }


        }


    }


    public void CountTeachersBySubject(Scanner scanner) {

        //Variables that will count how much of these subjects appear
        int mathCount = 0;
        int englishCount = 0;
        int historyCount = 0;


        System.out.print("Enter teach subject: ");
        String teacherSubject = scanner.nextLine();

        for (int i = 0; i < teachers.size(); i++) {
            if (teacherSubject.equalsIgnoreCase("Math")) {
                mathCount++;
                System.out.println(mathCount + " Teachers have the subject Maths");
            }
            if (teacherSubject.equalsIgnoreCase("English")) {
                englishCount++;
                System.out.println(englishCount + " Teachers have the subject English");
            }

            if (teacherSubject.equalsIgnoreCase("History")) {
                historyCount++;
                System.out.println(historyCount + " Teachers have the subject History");
            }

            System.out.println("----------------------------------------------------------------------");
            System.out.println("Maths: " + mathCount);
            System.out.println("English: " + englishCount);
            System.out.println("History: " + historyCount);
            System.out.println("----------------------------------------------------------------------");


        }


    }


}






