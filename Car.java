/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

class Car extends Vehicle {
    private int doors; // the vehicle is a f1 car so it does not have a door, it has an open-cockpit
    private String engineType;
    final int wheels;
    private boolean engineRunning; // Engine state

    public Car(String make, String model, int year, int doors, String engineType, int wheels) {
        super(make, model, year);
        this.doors = doors;
        this.engineType = engineType;
        this.wheels = wheels;
        this.engineRunning = false;
    }

    @Override
    public void start() {
        engineRunning = true;
        System.out.println("Car engine is starting...");
    }

    @Override
    public void engineNote() {
        System.out.println("Rrrr-rrr-vroom");
    }

    @Override
    public void stop() {
        engineRunning = false;
        System.out.println("Car engine stops.");
    }

    @Override
    public String getDetails() {
        return year + " " + make + " " + model + " with a " + engineType + " engine.";
    }

}
