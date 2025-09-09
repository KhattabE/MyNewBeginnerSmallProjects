public class Vehicle {

    //Class fields(Variables)
    private String brand;
    private String licensPlate;
    private String vehicleColor;
    boolean isVehicleElectric;


    //Vehicle class constructor
    Vehicle(String brand, String licensPlate, String vehicleColor, boolean isVehicleElectric) {
        this.brand = brand;
        this.licensPlate = licensPlate;
        this.vehicleColor = vehicleColor;
        this.isVehicleElectric = isVehicleElectric;


    }


    //Getter method to make the code readable
    public String getBrand() {
        return this.brand = brand;
    }

    public String getLicensPlate() {
        return this.licensPlate = licensPlate;
    }

    public String getVehicleColor() {
        return this.vehicleColor = vehicleColor;
    }

    public boolean isVehicleElectric() {
        return this.isVehicleElectric = isVehicleElectric;
    }

    //Setter method to make the code writeable
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicensPlate(String licensPlate) {
        this.licensPlate = licensPlate;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public void isVehicleElectric(boolean isVehicleElectric) {
        this.isVehicleElectric = isVehicleElectric;
    }

    void displayInfoAboutVehicle() {
        System.out.println("Vehicle brand: " + this.brand +
                "\nVehicle License Plate: " + this.licensPlate +
                "\nVehicle Color: " + this.vehicleColor +
                "\nIs vehicle electric?: " + this.isVehicleElectric);

    }


}
