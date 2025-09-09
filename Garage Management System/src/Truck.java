public class Truck extends Vehicle{

    //Child class(Truck) field
    public double maxLoadCapacity;

    //Child class(Truck) constructor
    Truck(String brand, String licensPlate, String vehicleColor, boolean isVehicleElectric, double maxLoadCapacity){

        //Super keyword to get the parent class constructor details
        super(brand, licensPlate, vehicleColor, isVehicleElectric);

        this.maxLoadCapacity = maxLoadCapacity;
    }


    //Getter method to make the field readable
    public double getMaxLoadCapacity(){
        return this.maxLoadCapacity;
    }

    //Setter method to make the field writable
    public void setMaxLoadCapacity(double maxLoadCapacity){
        this.maxLoadCapacity = maxLoadCapacity;
    }

    //Override the parent class displayInfoABoutVehicle method, to add extra info specified to this child class
    @Override
    void displayInfoAboutVehicle() {
        System.out.println("Vehicle brand: " + this.getBrand() +
                "\nVehicle License Plate: " + this.getLicensPlate() +
                "\nVehicle Color: " + this.getVehicleColor() +
                "\nIs vehicle electric?: " + this.isVehicleElectric +
                "\nMax Load Capacity: " + this.maxLoadCapacity);

    }


}
