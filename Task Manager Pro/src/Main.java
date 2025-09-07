import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //An arrayList to store tasks in (Empty in the beginning)
    ArrayList<Task> tasks = new ArrayList<>();


    public static void main(String[] args) {


        //Scanner to take user input
        Scanner scanner = new Scanner(System.in);


        //Method calling welcomeMessage()
        welcomeMessage(scanner);

        //Method calling menuSystem
        menuSystem(scanner);


        //Closing the scanner
        scanner.close();


    }

    //A static method welcoming the user
    static void welcomeMessage(Scanner scanner) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Welcome to the Task Manager Pro APP!");
        //Scanner to get the user to enter their name
        System.out.print("Enter your name to continue: ");
        String userName = scanner.nextLine();

        //While loop to make sure user does not enter an empty name
        while (userName.trim().isEmpty()) {
            //Scanner that keeps asking the user to try again, if name is not valid
            System.out.print("Enter a valid name: ");
            userName = scanner.nextLine();
        }

        System.out.println("Welcome back " + userName + "!");
        System.out.println("------------------------------------------------------------------------------");
    }


    static void menuSystem(Scanner scanner) {

        //Variable for user input menu choice
        int menuChoice = 0;

        //A while loop to allow the user to get back and from the menu as long as the user does not decide to quit
        while (menuChoice != 5) {
            System.out.print("Here are the following options you got: ");
            System.out.println("Option 1: Add Task");
            System.out.println("Option 2: View All Tasks");
            System.out.println("Option 3: Mark Task as Completed!");
            System.out.println("Option 4: Remove Task");
            System.out.println("Option 5 Exit: ");
            menuChoice = scanner.nextInt();
            scanner.nextLine();
        }

        //Will do a switch case here for the menu


    }

    //Method that contains the task adding section
    void addTask(Scanner scanner) {

        //Scanner to get the amount of tasks the user wants to add, i will limit it to 3
        System.out.print("Enter the amount of tasks you want to add(Max 3): ");
        int amountOfTasks = scanner.nextInt();
        scanner.nextLine();

        //For loop to get the information about the tasks (to add them to the array later)
        for (int i = 0; i < amountOfTasks; i++) {

            System.out.print("Enter Task Title: ");
            String taskTitle = scanner.nextLine();
            System.out.println(taskTitle + " have been added");

            System.out.print("Enter Task due date:");
            String dueDate = scanner.nextLine();
            System.out.print(dueDate + " have been added");

            System.out.println("Enter Task priority(high, medium, low): ");
            String taskPriority = scanner.nextLine();

            //An if statement with boolean expressions to make sure the user only will be able to choose one of the 3 options
            if (!taskPriority.equals("high") && !taskPriority.equals("medium") && !taskPriority.equals("low")) {
                System.out.print("Enter one of the 3 valid options!(high, medium, low): ");
                taskPriority = scanner.nextLine();
            } else {
                System.out.println(taskPriority + " have been added");
            }

        }


    }


}
