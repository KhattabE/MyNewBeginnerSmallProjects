import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //ArrayList for vehicles
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {


        //Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        //Method calling menuSystem()
        menuSystem(scanner);



    }

    //Method that will contain the menu System functionality
    static void menuSystem(Scanner scanner) {

        System.out.println("----------------------------------------------------------");
        //Welcome message
        System.out.println("Welcome to the Garage Management System!");
        //Asks for the users name, through the usage of scanner (User input)
        System.out.print("Enter your name to gain access: ");
        //A scanner to take the input from the user, (String input)
        String userName = scanner.nextLine();
        System.out.println("----------------------------------------------------------");

        //A while loop to make sure that the user input is not empty(space button)
        while (userName.trim().isEmpty()) {
            System.out.print("Enter a valid name please!: ");
            userName = scanner.nextLine();
        }
        System.out.println("Welcome " + userName + "!");
        System.out.println("----------------------------------------------------------");


        //Menu options
        System.out.println("You got the following options to choose from: ");
        System.out.println("1: Add a Vehicle");
        System.out.println("2: View all Vehicles");
        System.out.println("3: Search vehicle by license Plate");
        System.out.println("4: Show vehicle Counts by Type");
        System.out.println("5: Exit the system");
        //User input to choose one of the following choices
        System.out.print("Enter your choice(1-5): ");
        int optionChoice = scanner.nextInt();
        System.out.println("----------------------------------------------------------");
        //To remove new line
        scanner.nextLine();
        




    }


}
