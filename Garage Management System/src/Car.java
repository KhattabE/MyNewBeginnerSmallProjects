public class Car extends Vehicle {

    //Child class (Car) fields
    private int numbOfDoors;


    //Child class (Car) constructor
    Car(String brand, String licensPlate, String vehicleColor, boolean isVehicleElectric, int numbOfDoors) {

        //Super keyword to get the parent class constructor details
        super(brand, licensPlate, vehicleColor, isVehicleElectric);

        this.numbOfDoors = numbOfDoors;

    }


    //Getter to make numOfDoors readable
    public int getNumbOfDoors() {
        return this.numbOfDoors;
    }

    //Setter to make numOfDoors writable
    public void setNumbOfDoors(int numbOfDoors) {
        this.numbOfDoors = numbOfDoors;
    }

    @Override
    void displayInfoAboutVehicle() {
        System.out.println("Vehicle brand: " + this.getBrand() +
                "\nVehicle License Plate: " + this.getLicensPlate() +
                "\nVehicle Color: " + this.getBrand() +
                "\nIs vehicle electric?: " + this.isVehicleElectric +
                "\nVehicle Door amount: " + this.numbOfDoors);

    }


}
