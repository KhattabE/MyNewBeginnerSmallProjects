import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Scanner object for user input
        Scanner scanner = new Scanner(System.in);



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



        //Asking user to input the student name
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        //A while loop to make sure that the teacher does not input an empty student
        while (studentName.trim().isEmpty()){
            System.out.print("Enter a valid student name: ");
            studentName = scanner.nextLine();
        }
        //
        System.out.println(studentName + " have been added to the system!");


        //Asking the user to input the ID of the student they wrote in studentName
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        //To remove the new line
        scanner.nextLine();

        //Student object, takes the user input student name and ID as its arguments
        Student student1 = new Student(studentName, studentID);

















    }


}
