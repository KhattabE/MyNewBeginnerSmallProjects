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








        











    }


}
