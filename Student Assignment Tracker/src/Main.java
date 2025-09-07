import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Scanner object for user input
        Scanner scanner = new Scanner(System.in);


        System.out.println("----------------------------------------------------------------------------");
        //Welcome message + name entering for interactivity
        System.out.println("Welcome to the Student Assignment Tracker app!");
        System.out.print("Enter Your Name to continue: ");
        String teacherName = scanner.nextLine();

        //A while loop to make sure that the user does not input something empty
        while (teacherName.trim().isEmpty()) {
            System.out.print("Enter a valid name: ");
            teacherName = scanner.nextLine();
        }
        //Welcoming the teacher after entering name
        System.out.println("Welcome " + teacherName + "!");
        System.out.println("----------------------------------------------------------------------------");


        //Asking user to input the student name
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        //A while loop to make sure that the teacher does not input an empty student
        while (studentName.trim().isEmpty()){
            System.out.print("Enter a valid student name: ");
            studentName = scanner.nextLine();
        }
        //outputs that the student have been added
        System.out.println(studentName + " have been added to the system!");

        System.out.println("----------------------------------------------------------------------------");

        //Asking the user to input the ID of the student they wrote in studentName
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        //To remove the new line
        scanner.nextLine();

        //outputs that the student ID have been added
        System.out.println(studentID + " have been added to the system!");
        System.out.println("----------------------------------------------------------------------------");


        //Student object, takes the user input student name and ID as its arguments
        Student student1 = new Student(studentName, studentID);


        //User input to assign the amount of assignment the teacher wants to assign
        System.out.print("Enter the amount of assignment you want to add: ");
        int amountOfAssignment = scanner.nextInt();
        //To remove the new line
        scanner.nextLine();

        //A for loop to store the assignment info
        for(int i = 0; i < amountOfAssignment; i++){

            //User input to get assignment title from teacher
            System.out.print("Enter assignment title: ");
            String assignmentTitle = scanner.nextLine();

            //User input to get assignment subject from teacher
            System.out.print("Enter assignment subject: ");
            String assignmentSubject = scanner.nextLine();

            //User input to get assignment submission date from teacher
            System.out.print("Enter the assignment submission date: ");
            String assignmentDueDate = scanner.nextLine();

            boolean assignmentIsCompleted = false;
            System.out.print("Is assignment completed?(yes, no): ");
            String isAssignmentCompleted = scanner.nextLine();

            if(isAssignmentCompleted.equals("yes")) {
                assignmentIsCompleted = true;
                System.out.println("The student have completed the assignment!");
            }else if(isAssignmentCompleted.equals("no")) {
                System.out.println("The student have NOT completed the assignment!");
            }

            //Assignment object, takes the user inputs info as arguments
            Assignment assignments = new Assignment(assignmentTitle,assignmentSubject, assignmentDueDate, assignmentIsCompleted);
            student1.addAssignment(assignments);
        }

            student1.displayAllAssignments();

















    }


}
