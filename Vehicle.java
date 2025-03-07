
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES.
Philip Cardozo
*/

// Abstract class representing what kind of vehicle, in this case a f1 car
abstract class Vehicle implements Drivable {
    protected String make; // Manufacturer
    protected String model; // Mercedes-AMG F1 W15 E Performance
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void engineNote(); //

    public String getDetails() {
        return year + " " + make + " " + model;
    }
}
