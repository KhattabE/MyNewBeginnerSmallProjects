public class Motorcycle extends Vehicle {

    //Child class(Motorcycle) fields
    private boolean hasSidecar;

    //Child class(Motorcycle) constructor
    Motorcycle(String brand, String licensPlate, String vehicleColor, boolean isVehicleElectric, boolean hasSidecar) {
        //Super keyword to get the parent class constructor details
        super(brand, licensPlate, vehicleColor, isVehicleElectric);

        this.hasSidecar = hasSidecar;
    }


    //Getter method to make hasSidecar field readable
    public boolean getHasSidecar() {
        return this.hasSidecar;
    }


    //Setter method to make hasSidecar field writable
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    //Override the parent class displayInfoABoutVehicle method, to add extra info specified to this child class
    @Override
    void displayInfoAboutVehicle() {
        System.out.println("Vehicle brand: " + this.getBrand() +
                "\nVehicle License Plate: " + this.getLicensPlate() +
                "\nVehicle Color: " + this.getVehicleColor() +
                "\nIs vehicle electric?: " + this.isVehicleElectric +
                "\nOwns a car?: " + this.hasSidecar);

    }


}
