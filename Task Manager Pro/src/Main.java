import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //An arrayList to store tasks in (Empty in the beginning)
    static ArrayList<Task> tasks = new ArrayList<>();


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
            System.out.println("Here are the following options you got: ");
            System.out.println("Option 1: Add Task");
            System.out.println("Option 2: View All Tasks");
            System.out.println("Option 3: Mark Task as Completed!");
            System.out.println("Option 4: Remove Task");
            System.out.println("Option 5 Exit: ");
            System.out.print("Enter your choice(1-5): ");
            menuChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("------------------------------------------------------------------------------");

            //Will do a switch case here for the menu
            switch (menuChoice) {

                //Method calling addTask()
                case 1 -> addTask(scanner);

                case 2 -> viewTasks();

                case 3 -> completeTask(scanner);

                case 4 -> deleteTask(scanner);

                case 5 -> System.exit(0);
            }

        }


    }

    //Method that contains the task adding section
    static void addTask(Scanner scanner) {

        //Scanner to get the amount of tasks the user wants to add, i will limit it to 3
        System.out.print("Enter the amount of tasks you want to add(Max 3): ");
        int amountOfTasks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("------------------------------------------------------------------------------");

        //For loop to get the information about the tasks (to add them to the array later)
        for (int i = 0; i < amountOfTasks; i++) {

            System.out.print("Enter Task Title: ");
            String taskTitle = scanner.nextLine();
            System.out.println(taskTitle + " have been added");
            System.out.println("------------------------------------------------------------------------------");

            System.out.print("Enter Task due date: ");
            String dueDate = scanner.nextLine();
            System.out.println(dueDate + " have been added");
            System.out.println("------------------------------------------------------------------------------");

            System.out.print("Enter Task priority(high, medium, low): ");
            String taskPriority = scanner.nextLine();

            //A while loop with boolean expressions to make sure the user only will be able to choose one of the 3 options
            while (!taskPriority.equalsIgnoreCase("high") && !taskPriority.equalsIgnoreCase("medium")
                    && !taskPriority.equalsIgnoreCase("low")) {
                System.out.print("Enter one of the 3 valid options!(high, medium, low): ");
                taskPriority = scanner.nextLine();
            }
            System.out.println(taskPriority + " have been added");
            System.out.println("------------------------------------------------------------------------------");

            boolean isTaskCompleted = false;
            System.out.print("Enter (yes) if task completed, (no) if not: ");
            String taskCompleted = scanner.nextLine();

            if (taskCompleted.equalsIgnoreCase("Yes")) {
                isTaskCompleted = true;
                System.out.println("The task has been completed!");
                System.out.println("------------------------------------------------------------------------------");
            } else if (taskCompleted.equalsIgnoreCase("No")) {
                System.out.println("The task has NOT ben completed!");
                System.out.println("------------------------------------------------------------------------------");
            }

            //Creates a task object, that takes the info from the user, and assigns them to the Task class fields(Variables)
            Task tasksFromUserInput = new Task(taskTitle, dueDate, taskPriority, isTaskCompleted);
            //Adds the tasks we got from the user, into the arraylist
            tasks.add(tasksFromUserInput);

        }
    }

    static void viewTasks() {
        //Loops through the arrayList to display the stored task information form user input
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Here are the task information:");
            System.out.println("[" + (i + 1) + "] " + tasks.get(i));
            System.out.println("------------------------------------------------------------------------------");
        }
        if (tasks.isEmpty()) {
            System.out.println("Nothing have been added to the list yet!");
            System.out.println("------------------------------------------------------------------------------");
        }
    }

    static void completeTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("Nothing have been added to the list yet!");
            System.out.println("------------------------------------------------------------------------------");
        }

        //Method calling viewTasks()
        viewTasks();

        System.out.print("Enter the task you want marked as completed: ");
        int markAsCompleted = scanner.nextInt();
        scanner.nextLine();
        while (markAsCompleted > tasks.size() || (markAsCompleted < 1)) {
            System.out.print("Enter a valid amount (" + tasks.size() + "): ");
            markAsCompleted = scanner.nextInt();
            scanner.nextLine();
        }

        Task selectedTask = tasks.get(markAsCompleted - 1);
        selectedTask.setIsCompleted(true);
        System.out.println("Task \"" + selectedTask.getTitle() + "\" has been marked as completed!");
    }

    static void deleteTask(Scanner scanner) {
        if (tasks.isEmpty()) {
            System.out.println("Nothing have been added to the list yet!");
            System.out.println("------------------------------------------------------------------------------");
        }

        //Method calling viewTasks()
        viewTasks();

        System.out.print("Enter the task you want to remove: ");
        int numberOfTheTaskToRemove= scanner.nextInt();
        scanner.nextLine();
        while (numberOfTheTaskToRemove > tasks.size() || (numberOfTheTaskToRemove < 1)) {
            System.out.print("Enter a valid amount (" + tasks.size() + "): ");
            numberOfTheTaskToRemove = scanner.nextInt();
            scanner.nextLine();
        }

        Task deleteTheTask = tasks.remove(numberOfTheTaskToRemove - 1);
        System.out.println(" Task \"" + deleteTheTask.getTitle() + "\" has been removed from your list.");



    }


}









