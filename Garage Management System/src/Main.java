import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    //ArrayList for vehicles
    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public static void main(String[] args) {


        //Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        //Makes the code more oop
        Main app = new Main();

        //Method calling menuSystem()
        app.menuSystem(scanner);

        //Closing the scanner
        scanner.close();


    }

    //Method that will contain the menu System functionality
    public void menuSystem(Scanner scanner) {

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


        int optionChoice = -1;


        System.out.println("----------------------------------------------------------");

        //A while loop to keep looping inside the menu, until user enters 5(Exit)
        while (optionChoice != 5) {
            System.out.println("You got the following options to choose from: ");
            System.out.println("1: Add a Vehicle");
            System.out.println("2: View all Vehicles");
            System.out.println("3: Search vehicle by license Plate");
            System.out.println("4: Show vehicle Counts by Type");
            System.out.println("5: Exit the system");
            //User input to choose one of the following choices
            System.out.print("Enter your choice(1-5): ");
            optionChoice = scanner.nextInt();
            System.out.println("----------------------------------------------------------");
            //To remove new line
            scanner.nextLine();

            //A while loop to make sure the user stays inside the range of 1 to 5
            while ((optionChoice < 1 || optionChoice > 5)) {
                System.out.print("Enter a valid choice(1-5)!: ");
                optionChoice = scanner.nextInt();
                scanner.nextLine();
            }

            switch (optionChoice) {

                case 1 -> addVehicle(scanner); //Method calling addVehicle

                case 2 -> viewAllVehicles(); //Method calling viewAllVehicles()

                case 3 -> searchVehiclePlate(scanner); //Method calling searchVehiclePlate()

                case 4 -> showVehicleCountByType(scanner); //Method calling showVehicleCountByType()

                case 5 -> System.exit(0);


            }
        }
    }


    //Method to add vehicles
    public void addVehicle(Scanner scanner) {
        System.out.println("----------------------------------------------------------");
        System.out.print("Which type of car would you like to add(Car, Motorcycle, Truck)?: ");
        //Asks user to choose one of the following vehicles
        String typeOfCarChoice = scanner.nextLine();

        //A while loop to ensure that the user pick on of the valid Strings (Car, Motorcycle, Truck)
        while (!typeOfCarChoice.equalsIgnoreCase("Car") &&
                !typeOfCarChoice.equalsIgnoreCase("Motorcycle") &&
                !typeOfCarChoice.equalsIgnoreCase("Truck")) {
            System.out.print("Enter a valid option(Car, Motorcycle, Truck)!: ");
            typeOfCarChoice = scanner.nextLine();
        }

        //An if-else statement to see which type of vehicle has been picked
        if (typeOfCarChoice.equalsIgnoreCase("Car")) {

            System.out.println("----------------------------------------------------------");
            //Asks for the car brand
            System.out.print("Enter car brand: ");
            String carBrand = scanner.nextLine();
            System.out.println(carBrand + " have been added!");
            System.out.println("----------------------------------------------------------");

            //Ask for car license plate
            System.out.print("Enter the License plate of the car: ");
            String carLicensePlate = scanner.nextLine();
            System.out.println(carLicensePlate + " have been added!");
            System.out.println("----------------------------------------------------------");

            //Asks for the color of the car
            System.out.print("Enter car color: ");
            String carColor = scanner.nextLine();
            System.out.println(carColor + " have been added!");
            System.out.println("----------------------------------------------------------");

            //Asks if the car is electric
            boolean isTheCarElectric = false;
            System.out.print("Is the car electric(yes/no): ");
            String carEngine = scanner.nextLine();

            //A while loop to make sure the user inputs something valid
            while (!carEngine.equalsIgnoreCase("Yes") && !carEngine.equalsIgnoreCase("No")) {
                System.out.print("Enter a valid option(Yes/No)!: ");
                carEngine = scanner.nextLine();
            }
            //An if statement to check if the car is electric or not based on the user input
            if (carEngine.equalsIgnoreCase("Yes")) {
                isTheCarElectric = true;
                System.out.println("The car is electric");
            } else if (carEngine.equalsIgnoreCase("No")) {
                System.out.println("The car is NOT electric");
            }

            //Asks for how many doors the car has
            System.out.print("Enter the amount of doors(2 or 4): ");
            int amountOfDoors = scanner.nextInt();
            //to remove new line
            scanner.nextLine();
            System.out.println(amountOfDoors + " have been added!");

            while (amountOfDoors != 2 && amountOfDoors != 4) {
                System.out.print("Enter a valid number(2 or 4)!: ");
                amountOfDoors = scanner.nextInt();
                //Remove new line
                scanner.nextLine();

            }

            //Car object that receives the information from the user
            Car carPicked = new Car(carBrand, carLicensePlate, carColor, isTheCarElectric, amountOfDoors);
            //Adding the cars object with the information to the ArrayList
            vehicles.add(carPicked);


        } else if (typeOfCarChoice.equalsIgnoreCase("Motorcycle")) {

            System.out.println("----------------------------------------------------------");
            //Asks the user for motorcycle brand
            System.out.print("Enter Motorcycle brand: ");
            String motorcycleBrand = scanner.nextLine();
            System.out.println(motorcycleBrand + " has been added!");
            System.out.println("----------------------------------------------------------");

            //Asks the user for motorcycle license plate
            System.out.print("Enter motorcycle license plate: ");
            String motorcycleLicensePlate = scanner.nextLine();
            System.out.println(motorcycleLicensePlate + " has been added!");
            System.out.println("----------------------------------------------------------");

            //Asks for the color of the motorcycle
            System.out.print("Enter color of motorcycle:");
            String motorcycleColor = scanner.nextLine();
            System.out.println(motorcycleColor + " has been added!");


            //Asks if the motorcycle is electric
            boolean isTheMotorCycleElectric = false;
            System.out.print("Is motorcycle electric(Yes/No)?: ");
            String motorcycleEngineType = scanner.nextLine();

            while (!motorcycleEngineType.equalsIgnoreCase("Yes") &&
                    !motorcycleEngineType.equalsIgnoreCase("No")) {
                System.out.print("Enter a valid choice(Yes/No)!");
                motorcycleEngineType = scanner.nextLine();
            }

            if (motorcycleEngineType.equalsIgnoreCase("Yes")) {
                isTheMotorCycleElectric = true;
                System.out.print("The motorcycle is electric!");
            } else if (motorcycleEngineType.equalsIgnoreCase("No")) {
                System.out.println("The motorcycle is NOT electric!");
            }

            //Asks if the user has a car beside the bike
            boolean hasASideCar = false;
            System.out.print("Do you have a car?(Yes/No): ");
            String sideCar = scanner.nextLine();

            while (!sideCar.equalsIgnoreCase("Yes") &&
                    !sideCar.equalsIgnoreCase("No")) {
                System.out.print("Enter a valid choice(Yes/No)!: ");
                sideCar = scanner.nextLine();
            }

            if (sideCar.equalsIgnoreCase("Yes")) {
                hasASideCar = true;
                System.out.print("Has a car!");
            } else if (sideCar.equalsIgnoreCase("No")) {
                System.out.println("No car!");
            }

            Motorcycle motorcyclePicked = new Motorcycle(motorcycleBrand, motorcycleLicensePlate, motorcycleColor, isTheMotorCycleElectric,
                    hasASideCar);
            //Adds the objects info into the arrayList
            vehicles.add(motorcyclePicked);

        } else if (typeOfCarChoice.equalsIgnoreCase("Truck")) {

            System.out.println("----------------------------------------------------------");
            //Asks the user for truck brand
            System.out.print("Enter Truck brand: ");
            String TruckBrand = scanner.nextLine();
            System.out.println(TruckBrand + " has been added!");
            System.out.println("----------------------------------------------------------");

            //Asks the user for truck license plate
            System.out.print("Enter Truck license plate: ");
            String TruckLicensePlate = scanner.nextLine();
            System.out.println(TruckLicensePlate + " has been added!");
            System.out.println("----------------------------------------------------------");

            //Asks for the color of the truck
            System.out.print("Enter color of Truck:");
            String TruckColor = scanner.nextLine();
            System.out.println(TruckColor + " has been added!");


            //Asks if the truck is electric
            boolean isTheTruckElectric = false;
            System.out.print("Is Truck electric(Yes/No)?: ");
            String TruckEngineType = scanner.nextLine();

            while (!TruckEngineType.equalsIgnoreCase("Yes") &&
                    !TruckEngineType.equalsIgnoreCase("No")) {
                System.out.print("Enter a valid choice(Yes/No)!");
                TruckEngineType = scanner.nextLine();
            }

            if (TruckEngineType.equalsIgnoreCase("Yes")) {
                isTheTruckElectric = true;
                System.out.print("The truck is electric!");
            } else if (TruckEngineType.equalsIgnoreCase("No")) {
                System.out.println("The truck is NOT electric!");
            }

            //Asks the user for the truck max load capacity
            System.out.print("What is the max load capacity of the truck: ");
            double maxLoadCapacity = scanner.nextDouble();
            scanner.nextLine();
            System.out.println(maxLoadCapacity + " has been added");

            //Takes the user input from user and passes it into the object constructor
            Truck truckPicked = new Truck(TruckBrand, TruckLicensePlate, TruckColor, isTheTruckElectric, maxLoadCapacity);
            //Adds it into the ArrayList
            vehicles.add(truckPicked);
        }
    }


    //Method to view all vehicles
    public void viewAllVehicles() {

        //An if statement to check is the list is empty
        if (vehicles.isEmpty()) {
            System.out.println("The list is empty!");
            System.out.println("----------------------------------------------------------");
        } else {

            //Enhanced for loop to loop through the arraylist and get the info
            for (Vehicle v : vehicles) {
                v.displayInfoAboutVehicle();
            }
        }
    }


    //Method to find vehicle by searching the plate number
    public void searchVehiclePlate(Scanner scanner) {
        //Asks the user to enter the plate of the vehicle
        System.out.print("Enter the plate of the vehicle: ");
        String searchVehiclePlate = scanner.nextLine();
        System.out.println("----------------------------------------------------------");

        //For loop to loop through the arraylist and find vehicle by plate (if it exists in the arraylist)
        for (int i = 0; i < vehicles.size(); i++) {
            if (searchVehiclePlate.equalsIgnoreCase(vehicles.get(i).getLicensPlate())) {
                vehicles.get(i).displayInfoAboutVehicle();
            } else {
                System.out.println("Vehicle NOT FOUND!");
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    public void showVehicleCountByType(Scanner scanner){
        int carCount = 0;
        int motorcycleCount = 0;
        int truckCount = 0;

        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                carCount++;
            } else if (v instanceof Motorcycle) {
                motorcycleCount++;
            } else if (v instanceof Truck) {
                truckCount++;
            }
        }

        System.out.println("Total Cars: " + carCount);
        System.out.println("Total Motorcycles: " + motorcycleCount);
        System.out.println("Total Trucks: " + truckCount);
    }

}
